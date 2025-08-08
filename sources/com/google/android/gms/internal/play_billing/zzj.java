package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzj {
    static final zzj zza = new zzj(null, null);
    final Runnable zzb;
    final Executor zzc;
    zzj zzd;

    zzj(Runnable runnable, Executor executor) {
        this.zzb = runnable;
        this.zzc = executor;
    }
}
