// default package

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class erd implements prd {
    public static final j26 b = new j26(erd.class, (byte) 3);
    public final Object a;

    public erd(Object obj) {
        this.a = obj;
    }

    @Override // prd
    public final void c(Runnable runnable, Executor executor) {
        if (executor == null) {
            p3d.h("Executor was null.");
            return;
        }
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            b.c().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", qd4.q("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
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
    public final Object get() {
        return this.a;
    }
}
