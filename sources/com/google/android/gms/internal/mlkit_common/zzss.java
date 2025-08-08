package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes.dex */
public abstract class zzss {
    private static zzsr zza;

    public static synchronized zzsh zza(zzsb zzsbVar) {
        zzsh zzshVar;
        synchronized (zzss.class) {
            try {
                if (zza == null) {
                    zza = new zzsr(null);
                }
                zzshVar = (zzsh) zza.get(zzsbVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzshVar;
    }

    public static synchronized zzsh zzb(String str) {
        zzsh zza2;
        synchronized (zzss.class) {
            zza2 = zza(zzsb.zzd("common").zzd());
        }
        return zza2;
    }
}
