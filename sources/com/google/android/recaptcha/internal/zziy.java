package com.google.android.recaptcha.internal;

import v7.t7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
            if (((zziq) t7.a(zzix.zza).a()).zzb(str)) {
                return cls2;
            }
            throw new zzdm(6, 47, null);
        } catch (Exception e) {
            throw new zzdm(6, 8, e);
        }
    }
}
