package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class zzot {
    public static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str.concat(" must not be null"));
    }

    public static String zzb(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("identifier must not be empty");
        }
        if (!zzc(str.charAt(0))) {
            throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(str));
        }
        for (int i10 = 1; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (!zzc(charAt) && ((charAt < '0' || charAt > '9') && charAt != '_')) {
                throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
            }
        }
        return str;
    }

    private static boolean zzc(char c10) {
        if (c10 < 'a' || c10 > 'z') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }
}
