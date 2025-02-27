package com.google.android.gms.internal.cast;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public abstract class zzsc {
    public static zzrx zza(ExecutorService executorService) {
        if (executorService instanceof zzrx) {
            return (zzrx) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzsb((ScheduledExecutorService) executorService) : new zzry(executorService);
    }
}
