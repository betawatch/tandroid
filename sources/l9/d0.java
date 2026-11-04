package l9;

import com.google.android.gms.internal.cast.g4;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d0 extends a0 implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public d0(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // l9.a0, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        g4.g(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        g0 g0Var = new g0(callable);
        return new b0(g0Var, this.b.schedule(g0Var, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        c0 c0Var = new c0(runnable);
        return new b0(c0Var, this.b.scheduleAtFixedRate(c0Var, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        c0 c0Var = new c0(runnable);
        return new b0(c0Var, this.b.scheduleWithFixedDelay(c0Var, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        g0 g0Var = new g0(Executors.callable(runnable, null));
        return new b0(g0Var, this.b.schedule(g0Var, j10, timeUnit));
    }
}
