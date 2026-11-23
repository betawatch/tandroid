package m9;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class b0 extends h9.o implements ScheduledFuture, y, Future {
    public final o b;
    public final ScheduledFuture c;

    public b0(o oVar, ScheduledFuture scheduledFuture) {
        this.b = oVar;
        this.c = scheduledFuture;
    }

    @Override // m9.y
    public final void b(Runnable runnable, Executor executor) {
        this.b.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean z11 = z(z10);
        if (z11) {
            this.c.cancel(z10);
        }
        return z11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.c.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.c.getDelay(timeUnit);
    }

    @Override // h9.o
    public final Object i() {
        return this.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final boolean z(boolean z10) {
        return this.b.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.b.get(j3, timeUnit);
    }
}
