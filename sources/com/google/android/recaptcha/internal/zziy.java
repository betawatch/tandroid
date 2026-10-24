package com.google.android.recaptcha.internal;

import v7.h8;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
            throw new zzdm(4, 6, null);
        }
        if (!(obj instanceof String)) {
            throw new zzdm(4, 5, null);
        }
        try {
            String str = (String) obj;
            Class<?> cls2 = Class.forName(str);
            int i10 = zzby.zza;
            if (((zziq) h8.a(zzix.zza).a()).zzb(str)) {
                return cls2;
            }
            throw new zzdm(6, 47, null);
        } catch (Exception e) {
            throw new zzdm(6, 8, e);
        }
    }
}
