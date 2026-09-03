package com.google.android.gms.internal.cast;

import java.util.concurrent.Delayed;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class m4 extends j7.v5 implements ScheduledFuture, v8.a, Future {
    public final e4 b;
    public final ScheduledFuture c;

    public m4(e4 e4Var, ScheduledFuture scheduledFuture) {
        this.b = e4Var;
        this.c = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        boolean cancel = this.b.cancel(z4);
        if (cancel) {
            this.c.cancel(z4);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
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

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.a instanceof w3;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.b.get(j10, timeUnit);
    }
}
