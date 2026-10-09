package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
final class zztn {
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
