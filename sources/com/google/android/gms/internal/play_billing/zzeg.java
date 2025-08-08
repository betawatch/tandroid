package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class zzeg extends zzcf implements Future {
    protected zzeg() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return zzc().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return zzc().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return zzc().isDone();
    }

    protected abstract Future zzc();

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return zzc().get(j, timeUnit);
    }
}
