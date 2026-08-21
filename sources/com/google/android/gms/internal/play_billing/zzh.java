package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzh {
    static final zzh zza = new zzh(null, null);
    final Runnable zzb;
    final Executor zzc;
    zzh zzd;

    zzh(Runnable runnable, Executor executor) {
        this.zzb = runnable;
        this.zzc = executor;
    }
}
