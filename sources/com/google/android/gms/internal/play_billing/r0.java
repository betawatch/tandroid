package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class r0 implements t0 {
    public static final s0 b = new s0(r0.class, 0);
    public final Object a;

    public r0(Object obj) {
        this.a = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.t0
    public final void c(Runnable runnable, Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            b.c().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", com.google.android.recaptcha.internal.a.l("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.a.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a;
    }
}
