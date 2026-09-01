package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class q4 extends AtomicReference implements Runnable {
    public static final j4 c = new j4();
    public static final j4 d = new j4();
    public final Callable a;
    public final /* synthetic */ r4 b;

    public q4(r4 r4Var, Callable callable) {
        this.b = r4Var;
        callable.getClass();
        this.a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        i4 i4Var = null;
        boolean z4 = false;
        int i10 = 0;
        while (true) {
            boolean z10 = runnable instanceof i4;
            j4 j4Var = d;
            if (!z10) {
                if (runnable != j4Var) {
                    break;
                }
            } else {
                i4Var = (i4) runnable;
            }
            i10++;
            if (i10 <= 1000) {
                Thread.yield();
            } else if (runnable == j4Var || compareAndSet(runnable, j4Var)) {
                z4 = Thread.interrupted() || z4;
                LockSupport.park(i4Var);
            }
            runnable = (Runnable) get();
        }
        if (z4) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object call;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            r4 r4Var = this.b;
            boolean isDone = r4Var.isDone();
            j4 j4Var = c;
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
                        if (!compareAndSet(currentThread, j4Var)) {
                            a(currentThread);
                        }
                        if (e4.f.e(r4Var, null, new x3(th2))) {
                            e4.g(r4Var);
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(currentThread, j4Var)) {
                            a(currentThread);
                        }
                        if (e4.f.e(r4Var, null, e4.h)) {
                            e4.g(r4Var);
                        }
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(currentThread, j4Var)) {
                a(currentThread);
            }
            if (isDone) {
                return;
            }
            if (call == null) {
                call = e4.h;
            }
            if (e4.f.e(r4Var, null, call)) {
                e4.g(r4Var);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return android.support.v4.media.a.z(runnable == c ? "running=[DONE]" : runnable instanceof i4 ? "running=[INTERRUPTED]" : runnable instanceof Thread ? android.support.v4.media.a.o("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]", ", ", this.a.toString());
    }
}
