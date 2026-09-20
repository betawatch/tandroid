package i9;

import ai.z9;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import v7.j0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class d0 extends AtomicReference implements Runnable {
    public static final z9 c;
    public static final z9 d;
    public final Callable a;
    public final /* synthetic */ e0 b;

    static {
        int i10 = 2;
        c = new z9(i10);
        d = new z9(i10);
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
            z9 z9Var = d;
            if (!z11 && runnable != z9Var) {
                break;
            }
            if (z11) {
                vVar = (v) runnable;
            }
            i10++;
            if (i10 <= 1000) {
                Thread.yield();
            } else if (runnable == z9Var || compareAndSet(runnable, z9Var)) {
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
            z9 z9Var = c;
            if (!isDone) {
                try {
                    obj = this.a.call();
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, z9Var)) {
                            a(currentThread);
                        }
                        if (isDone) {
                            return;
                        }
                        e0Var.n(th2);
                        return;
                    } finally {
                        if (!compareAndSet(currentThread, z9Var)) {
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
        StringBuilder h = j0.h(str, ", ");
        h.append(this.a.toString());
        return h.toString();
    }
}
