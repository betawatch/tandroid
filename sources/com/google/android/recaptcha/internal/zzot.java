package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zzot {
    public static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        p3d.h(str.concat(" must not be null"));
        return null;
    }

    public static String zzb(String str) {
        if (str.isEmpty()) {
            lq5.j("identifier must not be empty");
            return null;
        }
        if (!zzc(str.charAt(0))) {
            lq5.j("identifier must start with an ASCII letter: ".concat(str));
            return null;
        }
        for (int i = 1; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!zzc(charAt) && ((charAt < '0' || charAt > '9') && charAt != '_')) {
                lq5.j("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                return null;
            }
        }
        return str;
    }

    private static boolean zzc(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }
}
