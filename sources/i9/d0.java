package i9;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class d0 extends AtomicReference implements Runnable {
    public static final androidx.emoji2.text.n c;
    public static final androidx.emoji2.text.n d;
    public final Callable a;
    public final /* synthetic */ e0 b;

    static {
        int i10 = 2;
        c = new androidx.emoji2.text.n(i10);
        d = new androidx.emoji2.text.n(i10);
    }

    public d0(e0 e0Var, Callable callable) {
        this.b = e0Var;
        callable.getClass();
        this.a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        v vVar = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = runnable instanceof v;
            androidx.emoji2.text.n nVar = d;
            if (!z11 && runnable != nVar) {
                break;
            }
            if (z11) {
                vVar = (v) runnable;
            }
            i10++;
            if (i10 <= 1000) {
                Thread.yield();
            } else if (runnable == nVar || compareAndSet(runnable, nVar)) {
                z10 = Thread.interrupted() || z10;
                LockSupport.park(vVar);
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
            e0 e0Var = this.b;
            boolean isDone = e0Var.isDone();
            androidx.emoji2.text.n nVar = c;
            if (!isDone) {
                try {
                    obj = this.a.call();
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, nVar)) {
                            a(currentThread);
                        }
                        if (isDone) {
                            return;
                        }
                        e0Var.n(th2);
                        return;
                    } finally {
                        if (!compareAndSet(currentThread, nVar)) {
                            a(currentThread);
                        }
                        if (!isDone) {
                            e0Var.m(null);
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
        } else if (runnable instanceof v) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder g10 = w.f.g(str, ", ");
        g10.append(this.a.toString());
        return g10.toString();
    }
}
