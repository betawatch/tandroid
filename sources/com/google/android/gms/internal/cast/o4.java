package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class o4 extends AtomicReference implements Runnable {
    public static final h4 c = new h4();
    public static final h4 d = new h4();
    public final Callable a;
    public final /* synthetic */ p4 b;

    public o4(p4 p4Var, Callable callable) {
        this.b = p4Var;
        callable.getClass();
        this.a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        g4 g4Var = null;
        boolean z9 = false;
        int i7 = 0;
        while (true) {
            boolean z10 = runnable instanceof g4;
            h4 h4Var = d;
            if (!z10) {
                if (runnable != h4Var) {
                    break;
                }
            } else {
                g4Var = (g4) runnable;
            }
            i7++;
            if (i7 <= 1000) {
                Thread.yield();
            } else if (runnable == h4Var || compareAndSet(runnable, h4Var)) {
                z9 = Thread.interrupted() || z9;
                LockSupport.park(g4Var);
            }
            runnable = (Runnable) get();
        }
        if (z9) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object call;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            p4 p4Var = this.b;
            boolean isDone = p4Var.isDone();
            h4 h4Var = c;
            if (isDone) {
                call = null;
            } else {
                try {
                    call = this.a.call();
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, h4Var)) {
                            a(currentThread);
                        }
                        if (c4.f.f(p4Var, null, new v3(th2))) {
                            c4.h(p4Var);
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(currentThread, h4Var)) {
                            a(currentThread);
                        }
                        if (c4.f.f(p4Var, null, c4.h)) {
                            c4.h(p4Var);
                        }
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(currentThread, h4Var)) {
                a(currentThread);
            }
            if (isDone) {
                return;
            }
            if (call == null) {
                call = c4.h;
            }
            if (c4.f.f(p4Var, null, call)) {
                c4.h(p4Var);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return a8.p0.D(runnable == c ? "running=[DONE]" : runnable instanceof g4 ? "running=[INTERRUPTED]" : runnable instanceof Thread ? a8.p0.p("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]", ", ", this.a.toString());
    }
}
