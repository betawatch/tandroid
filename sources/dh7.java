// default package

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class dh7 extends ah7 implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public dh7(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // ah7, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a3.g(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        i6c i6cVar = new i6c(Executors.callable(runnable, null));
        return new bh7(i6cVar, this.b.schedule(i6cVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ch7 ch7Var = new ch7(runnable);
        return new bh7(ch7Var, this.b.scheduleAtFixedRate(ch7Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ch7 ch7Var = new ch7(runnable);
        return new bh7(ch7Var, this.b.scheduleWithFixedDelay(ch7Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        i6c i6cVar = new i6c(callable);
        return new bh7(i6cVar, this.b.schedule(i6cVar, j, timeUnit));
    }
}
