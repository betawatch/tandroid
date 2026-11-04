package l9;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f0 extends AtomicReference implements Runnable {
    public static final androidx.emoji2.text.o c;
    public static final androidx.emoji2.text.o d;
    public final Callable a;
    public final /* synthetic */ g0 b;

    static {
        int i3 = 3;
        c = new androidx.emoji2.text.o(i3);
        d = new androidx.emoji2.text.o(i3);
    }

    public f0(g0 g0Var, Callable callable) {
        this.b = g0Var;
        callable.getClass();
        this.a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        x xVar = null;
        boolean z10 = false;
        int i3 = 0;
        while (true) {
            boolean z11 = runnable instanceof x;
            androidx.emoji2.text.o oVar = d;
            if (!z11 && runnable != oVar) {
                break;
            }
            if (z11) {
                xVar = (x) runnable;
            }
            i3++;
            if (i3 <= 1000) {
                Thread.yield();
            } else if (runnable == oVar || compareAndSet(runnable, oVar)) {
                z10 = Thread.interrupted() || z10;
                LockSupport.park(xVar);
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            g0 g0Var = this.b;
            boolean isDone = g0Var.isDone();
            androidx.emoji2.text.o oVar = c;
            if (!isDone) {
                try {
                    obj = this.a.call();
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, oVar)) {
                            a(currentThread);
                        }
                        if (isDone) {
                            return;
                        }
                        g0Var.n(th2);
                        return;
                    } finally {
                        if (!compareAndSet(currentThread, oVar)) {
                            a(currentThread);
                        }
                        if (!isDone) {
                            g0Var.m(null);
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == c) {
            str = "running=[DONE]";
        } else if (runnable instanceof x) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder h = t4.c.h(str, ", ");
        h.append(this.a.toString());
        return h.toString();
    }
}
