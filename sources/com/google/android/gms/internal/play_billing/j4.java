package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class j4 implements t0 {
    public final WeakReference a;
    public final i4 b = new i4(this);

    public j4(h4 h4Var) {
        this.a = new WeakReference(h4Var);
    }

    @Override // com.google.android.gms.internal.play_billing.t0
    public final void a(Runnable runnable, Executor executor) {
        this.b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        h4 h4Var = (h4) this.a.get();
        boolean cancel = this.b.cancel(z4);
        if (!cancel || h4Var == null) {
            return cancel;
        }
        h4Var.a = null;
        h4Var.b = null;
        h4Var.c.h(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.a instanceof j1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.b.get(j10, timeUnit);
    }
}
