package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zziy {
    public static final Class zza(Object obj) {
        if (obj instanceof Class) {
            return (Class) obj;
        }
        if (obj instanceof Integer) {
            int intValue = ((Number) obj).intValue();
            Class cls = intValue == 1 ? Integer.TYPE : intValue == 2 ? Short.TYPE : intValue == 3 ? Byte.TYPE : intValue == 4 ? Long.TYPE : intValue == 5 ? Character.TYPE : intValue == 6 ? Float.TYPE : intValue == 7 ? Double.TYPE : intValue == 8 ? Boolean.TYPE : null;
            if (cls != null) {
                return cls;
            }
            fvc.c(4, 6, null);
            return null;
        }
        if (!(obj instanceof String)) {
            fvc.c(4, 5, null);
            return null;
        }
        try {
            String str = (String) obj;
            Class<?> cls2 = Class.forName(str);
            int i = zzby.zza;
            if (((zziq) cne.b(zzix.zza).getValue()).zzb(str)) {
                return cls2;
            }
            fvc.c(6, 47, null);
            return null;
        } catch (Exception e) {
            fvc.c(6, 8, e);
            return null;
        }
    }
}
