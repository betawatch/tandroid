package io.noties.markwon.html.jsoup.helper;

import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class Normalizer {
    public static String lowerCase(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }
}
