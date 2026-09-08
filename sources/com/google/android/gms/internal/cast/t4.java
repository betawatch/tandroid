package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class t4 extends AtomicReference implements Runnable {
    public static final m4 c = new m4();
    public static final m4 d = new m4();
    public final Callable a;
    public final /* synthetic */ u4 b;

    public t4(u4 u4Var, Callable callable) {
        this.b = u4Var;
        callable.getClass();
        this.a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        l4 l4Var = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = runnable instanceof l4;
            m4 m4Var = d;
            if (!z11) {
                if (runnable != m4Var) {
                    break;
                }
            } else {
                l4Var = (l4) runnable;
            }
            i10++;
            if (i10 <= 1000) {
                Thread.yield();
            } else if (runnable == m4Var || compareAndSet(runnable, m4Var)) {
                z10 = Thread.interrupted() || z10;
                LockSupport.park(l4Var);
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
            u4 u4Var = this.b;
            boolean isDone = u4Var.isDone();
            m4 m4Var = c;
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
                        if (!compareAndSet(currentThread, m4Var)) {
                            a(currentThread);
                        }
                        if (h4.f.f(u4Var, null, new a4(th2))) {
                            h4.h(u4Var);
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(currentThread, m4Var)) {
                            a(currentThread);
                        }
                        if (h4.f.f(u4Var, null, h4.h)) {
                            h4.h(u4Var);
                        }
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(currentThread, m4Var)) {
                a(currentThread);
            }
            if (isDone) {
                return;
            }
            if (call == null) {
                call = h4.h;
            }
            if (h4.f.f(u4Var, null, call)) {
                h4.h(u4Var);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return a4.a.C(runnable == c ? "running=[DONE]" : runnable instanceof l4 ? "running=[INTERRUPTED]" : runnable instanceof Thread ? a4.a.p("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]", ", ", this.a.toString());
    }
}
