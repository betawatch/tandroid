// default package

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bff extends oef implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public bff(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // oef, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        z2.j(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        fff fffVar = new fff(Executors.callable(runnable, null));
        return new qef(fffVar, this.b.schedule(fffVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        aff affVar = new aff(runnable);
        return new qef(affVar, this.b.scheduleAtFixedRate(affVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        aff affVar = new aff(runnable);
        return new qef(affVar, this.b.scheduleWithFixedDelay(affVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        fff fffVar = new fff(callable);
        return new qef(fffVar, this.b.schedule(fffVar, j, timeUnit));
    }
}
