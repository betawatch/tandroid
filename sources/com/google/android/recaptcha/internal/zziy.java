package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
            p3d.d(4, 6, null);
            return null;
        }
        if (!(obj instanceof String)) {
            p3d.d(4, 5, null);
            return null;
        }
        try {
            String str = (String) obj;
            Class<?> cls2 = Class.forName(str);
            int i = zzby.zza;
            if (((zziq) ure.b(zzix.zza).getValue()).zzb(str)) {
                return cls2;
            }
            p3d.d(6, 47, null);
            return null;
        } catch (Exception e) {
            p3d.d(6, 8, e);
            return null;
        }
    }
}
