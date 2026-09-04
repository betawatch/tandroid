package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class j4 implements t0 {
    public final WeakReference a;
    public final i4 b = new i4(this);

    public j4(h4 h4Var) {
        this.a = new WeakReference(h4Var);
    }

    @Override // com.google.android.gms.internal.play_billing.t0
    public final void b(Runnable runnable, Executor executor) {
        this.b.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        h4 h4Var = (h4) this.a.get();
        boolean cancel = this.b.cancel(z10);
        if (!cancel || h4Var == null) {
            return cancel;
        }
        h4Var.a = null;
        h4Var.b = null;
        h4Var.c.i(null);
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
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.b.get(j3, timeUnit);
    }
}
