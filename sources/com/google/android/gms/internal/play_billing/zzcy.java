package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* loaded from: classes.dex */
final class zzcy {
    private final zzbm zza = new zzbm();
    private final String zzb;
    private volatile Logger zzc;

    zzcy(Class cls) {
        this.zzb = cls.getName();
    }

    final Logger zza() {
        Logger logger = this.zzc;
        if (logger != null) {
            return logger;
        }
        synchronized (this.zza) {
            try {
                Logger logger2 = this.zzc;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.zzb);
                this.zzc = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
