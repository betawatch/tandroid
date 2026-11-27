// default package

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class bh7 extends zme implements ScheduledFuture, x76, Future {
    public final u2 b;
    public final ScheduledFuture c;

    public bh7(u2 u2Var, ScheduledFuture scheduledFuture) {
        this.b = u2Var;
        this.c = scheduledFuture;
    }

    @Override // x76
    public final void b(Runnable runnable, Executor executor) {
        this.b.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean e = e(z);
        if (e) {
            this.c.cancel(z);
        }
        return e;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.c.compareTo(delayed);
    }

    @Override // zme
    public final Object d() {
        return this.b;
    }

    public final boolean e(boolean z) {
        return this.b.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.c.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
