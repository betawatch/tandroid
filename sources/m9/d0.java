package m9;

import com.google.android.gms.internal.cast.f4;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class d0 extends a0 implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public d0(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // m9.a0, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        f4.g(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j3, TimeUnit timeUnit) {
        g0 g0Var = new g0(callable);
        return new b0(g0Var, this.b.schedule(g0Var, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j3, long j10, TimeUnit timeUnit) {
        c0 c0Var = new c0(runnable);
        return new b0(c0Var, this.b.scheduleAtFixedRate(c0Var, j3, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j3, long j10, TimeUnit timeUnit) {
        c0 c0Var = new c0(runnable);
        return new b0(c0Var, this.b.scheduleWithFixedDelay(c0Var, j3, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j3, TimeUnit timeUnit) {
        g0 g0Var = new g0(Executors.callable(runnable, null));
        return new b0(g0Var, this.b.schedule(g0Var, j3, timeUnit));
    }
}
