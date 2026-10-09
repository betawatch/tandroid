package i9;

import ai.aa;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class d0 extends AtomicReference implements Runnable {
    public static final aa c;
    public static final aa d;
    public final Callable a;
    public final /* synthetic */ e0 b;

    static {
        int i10 = 2;
        c = new aa(i10);
        d = new aa(i10);
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
            aa aaVar = d;
            if (!z11 && runnable != aaVar) {
                break;
            }
            if (z11) {
                vVar = (v) runnable;
            }
            i10++;
            if (i10 <= 1000) {
                Thread.yield();
            } else if (runnable == aaVar || compareAndSet(runnable, aaVar)) {
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
            aa aaVar = c;
            if (!isDone) {
                try {
                    obj = this.a.call();
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, aaVar)) {
                            a(currentThread);
                        }
                        if (isDone) {
                            return;
                        }
                        e0Var.n(th2);
                        return;
                    } finally {
                        if (!compareAndSet(currentThread, aaVar)) {
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
        StringBuilder j3 = sc.v.j(str, ", ");
        j3.append(this.a.toString());
        return j3.toString();
    }
}
