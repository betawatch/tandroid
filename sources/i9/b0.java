package i9;

import com.google.android.gms.internal.cast.k4;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class b0 extends y implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public b0(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // i9.y, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        k4.g(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j3, TimeUnit timeUnit) {
        e0 e0Var = new e0(callable);
        return new z(e0Var, this.b.schedule(e0Var, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j3, long j10, TimeUnit timeUnit) {
        a0 a0Var = new a0(runnable);
        return new z(a0Var, this.b.scheduleAtFixedRate(a0Var, j3, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j3, long j10, TimeUnit timeUnit) {
        a0 a0Var = new a0(runnable);
        return new z(a0Var, this.b.scheduleWithFixedDelay(a0Var, j3, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j3, TimeUnit timeUnit) {
        e0 e0Var = new e0(Executors.callable(runnable, null));
        return new z(e0Var, this.b.schedule(e0Var, j3, timeUnit));
    }
}
