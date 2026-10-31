package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class o4 extends k4 implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public o4(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.cast.k4, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        cf.b.d(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        q4 q4Var = new q4(Executors.callable(runnable, null));
        return new l4(q4Var, this.b.schedule(q4Var, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        n4 n4Var = new n4(runnable);
        return new l4(n4Var, this.b.scheduleAtFixedRate(n4Var, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        n4 n4Var = new n4(runnable);
        return new l4(n4Var, this.b.scheduleWithFixedDelay(n4Var, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        q4 q4Var = new q4(callable);
        return new l4(q4Var, this.b.schedule(q4Var, j10, timeUnit));
    }
}
