package com.google.android.gms.internal.mlkit_language_id_common;

/* loaded from: classes.dex */
public abstract class zzlt {
    private static zzls zza;

    public static synchronized zzli zza(zzlc zzlcVar) {
        zzli zzliVar;
        synchronized (zzlt.class) {
            try {
                if (zza == null) {
                    zza = new zzls(null);
                }
                zzliVar = (zzli) zza.get(zzlcVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzliVar;
    }

    public static synchronized zzli zzb(String str) {
        zzli zza2;
        synchronized (zzlt.class) {
            zza2 = zza(zzlc.zzd(str).zzd());
        }
        return zza2;
    }
}
