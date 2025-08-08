package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes.dex */
public final class zzsv {
    private static zzsv zza;

    private zzsv() {
    }

    public static synchronized zzsv zza() {
        zzsv zzsvVar;
        synchronized (zzsv.class) {
            try {
                if (zza == null) {
                    zza = new zzsv();
                }
                zzsvVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzsvVar;
    }

    public static void zzb() {
        zzsu.zza();
    }
}
