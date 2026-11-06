package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class n4 extends j4 implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public n4(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.cast.j4, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        f4.d(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j3, TimeUnit timeUnit) {
        p4 p4Var = new p4(Executors.callable(runnable, null));
        return new k4(p4Var, this.b.schedule(p4Var, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j3, long j10, TimeUnit timeUnit) {
        m4 m4Var = new m4(runnable);
        return new k4(m4Var, this.b.scheduleAtFixedRate(m4Var, j3, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j3, long j10, TimeUnit timeUnit) {
        m4 m4Var = new m4(runnable);
        return new k4(m4Var, this.b.scheduleWithFixedDelay(m4Var, j3, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j3, TimeUnit timeUnit) {
        p4 p4Var = new p4(callable);
        return new k4(p4Var, this.b.schedule(p4Var, j3, timeUnit));
    }
}
