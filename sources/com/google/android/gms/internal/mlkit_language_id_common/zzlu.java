package com.google.android.gms.internal.mlkit_language_id_common;

/* loaded from: classes.dex */
public final class zzlu {
    private static zzlu zza;

    private zzlu() {
    }

    public static synchronized zzlu zza() {
        zzlu zzluVar;
        synchronized (zzlu.class) {
            try {
                if (zza == null) {
                    zza = new zzlu();
                }
                zzluVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzluVar;
    }
}
