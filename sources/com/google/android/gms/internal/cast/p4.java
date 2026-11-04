package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p4 extends AtomicReference implements Runnable {
    public static final i4 c = new i4();
    public static final i4 d = new i4();
    public final Callable a;
    public final /* synthetic */ q4 b;

    public p4(q4 q4Var, Callable callable) {
        this.b = q4Var;
        callable.getClass();
        this.a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        h4 h4Var = null;
        boolean z10 = false;
        int i3 = 0;
        while (true) {
            boolean z11 = runnable instanceof h4;
            i4 i4Var = d;
            if (!z11) {
                if (runnable != i4Var) {
                    break;
                }
            } else {
                h4Var = (h4) runnable;
            }
            i3++;
            if (i3 <= 1000) {
                Thread.yield();
            } else if (runnable == i4Var || compareAndSet(runnable, i4Var)) {
                z10 = Thread.interrupted() || z10;
                LockSupport.park(h4Var);
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object call;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            q4 q4Var = this.b;
            boolean isDone = q4Var.isDone();
            i4 i4Var = c;
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
                        if (!compareAndSet(currentThread, i4Var)) {
                            a(currentThread);
                        }
                        if (d4.f.f(q4Var, null, new w3(th2))) {
                            d4.h(q4Var);
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(currentThread, i4Var)) {
                            a(currentThread);
                        }
                        if (d4.f.f(q4Var, null, d4.h)) {
                            d4.h(q4Var);
                        }
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(currentThread, i4Var)) {
                a(currentThread);
            }
            if (isDone) {
                return;
            }
            if (call == null) {
                call = d4.h;
            }
            if (d4.f.f(q4Var, null, call)) {
                d4.h(q4Var);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return a1.g.C(runnable == c ? "running=[DONE]" : runnable instanceof h4 ? "running=[INTERRUPTED]" : runnable instanceof Thread ? a1.g.q("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]", ", ", this.a.toString());
    }
}
