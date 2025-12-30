package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
final class zztn {
    zztn() {
    }

    public static final boolean zza(Object obj) {
        return !((zztm) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zztm zztmVar = (zztm) obj;
        zztm zztmVar2 = (zztm) obj2;
        if (!zztmVar2.isEmpty()) {
            if (!zztmVar.zze()) {
                zztmVar = zztmVar.zzb();
            }
            zztmVar.zzd(zztmVar2);
        }
        return zztmVar;
    }
}
