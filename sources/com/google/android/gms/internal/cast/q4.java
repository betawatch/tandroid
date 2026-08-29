package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q4 extends m4 implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public q4(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.cast.m4, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        b9.b.e(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        s4 s4Var = new s4(Executors.callable(runnable, null));
        return new n4(s4Var, this.b.schedule(s4Var, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        p4 p4Var = new p4(runnable);
        return new n4(p4Var, this.b.scheduleAtFixedRate(p4Var, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        p4 p4Var = new p4(runnable);
        return new n4(p4Var, this.b.scheduleWithFixedDelay(p4Var, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        s4 s4Var = new s4(callable);
        return new n4(s4Var, this.b.schedule(s4Var, j10, timeUnit));
    }
}
