package com.devand.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * ajout de l'annotation Controller pour que la classe soit 'parse' et prise en compte comme telle
 */
@Controller
public class GreetingController {

    /**
     * utilisation de GetMapping pour 'lier' le JSP avec la méthode qui permet de retourner le message qui a été inséré
     * dans le .jsp avec l'EL ${message}
     * @param model
     * @return
     */
    @GetMapping("greeting")
    public String greeting (Map<String, Object> model) {
        model.put("message", "Hello Yabaduga");
        return "greeting";
    }
}
