// default package

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class adf extends ncf implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public adf(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // ncf, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        z2.j(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        edf edfVar = new edf(Executors.callable(runnable, null));
        return new pcf(edfVar, this.b.schedule(edfVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zcf zcfVar = new zcf(runnable);
        return new pcf(zcfVar, this.b.scheduleAtFixedRate(zcfVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zcf zcfVar = new zcf(runnable);
        return new pcf(zcfVar, this.b.scheduleWithFixedDelay(zcfVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        edf edfVar = new edf(callable);
        return new pcf(edfVar, this.b.schedule(edfVar, j, timeUnit));
    }
}
