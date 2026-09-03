package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class r4 extends AtomicReference implements Runnable {
    public static final k4 c = new k4();
    public static final k4 d = new k4();
    public final Callable a;
    public final /* synthetic */ s4 b;

    public r4(s4 s4Var, Callable callable) {
        this.b = s4Var;
        callable.getClass();
        this.a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        j4 j4Var = null;
        boolean z4 = false;
        int i10 = 0;
        while (true) {
            boolean z10 = runnable instanceof j4;
            k4 k4Var = d;
            if (!z10) {
                if (runnable != k4Var) {
                    break;
                }
            } else {
                j4Var = (j4) runnable;
            }
            i10++;
            if (i10 <= 1000) {
                Thread.yield();
            } else if (runnable == k4Var || compareAndSet(runnable, k4Var)) {
                z4 = Thread.interrupted() || z4;
                LockSupport.park(j4Var);
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
            s4 s4Var = this.b;
            boolean isDone = s4Var.isDone();
            k4 k4Var = c;
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
                        if (!compareAndSet(currentThread, k4Var)) {
                            a(currentThread);
                        }
                        if (f4.f.e(s4Var, null, new y3(th2))) {
                            f4.g(s4Var);
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(currentThread, k4Var)) {
                            a(currentThread);
                        }
                        if (f4.f.e(s4Var, null, f4.h)) {
                            f4.g(s4Var);
                        }
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(currentThread, k4Var)) {
                a(currentThread);
            }
            if (isDone) {
                return;
            }
            if (call == null) {
                call = f4.h;
            }
            if (f4.f.e(s4Var, null, call)) {
                f4.g(s4Var);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return android.support.v4.media.a.z(runnable == c ? "running=[DONE]" : runnable instanceof j4 ? "running=[INTERRUPTED]" : runnable instanceof Thread ? android.support.v4.media.a.o("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]", ", ", this.a.toString());
    }
}
