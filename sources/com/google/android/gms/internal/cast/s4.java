package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class s4 extends g4 implements RunnableFuture {
    public volatile r4 n;

    public s4(Callable callable) {
        this.n = new r4(this, callable);
    }

    @Override // com.google.android.gms.internal.cast.g4
    public final String b() {
        r4 r4Var = this.n;
        return r4Var != null ? a4.w.n("task=[", r4Var.toString(), "]") : super.b();
    }

    @Override // com.google.android.gms.internal.cast.g4
    public final void c() {
        r4 r4Var;
        Object obj = this.a;
        if ((obj instanceof y3) && ((y3) obj).a && (r4Var = this.n) != null) {
            k4 k4Var = r4.d;
            k4 k4Var2 = r4.c;
            Runnable runnable = (Runnable) r4Var.get();
            if (runnable instanceof Thread) {
                j4 j4Var = new j4(r4Var);
                j4Var.setExclusiveOwnerThread(Thread.currentThread());
                if (r4Var.compareAndSet(runnable, j4Var)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) r4Var.getAndSet(k4Var2)) == k4Var) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th2) {
                        if (((Runnable) r4Var.getAndSet(k4Var2)) == k4Var) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th2;
                    }
                }
            }
        }
        this.n = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        r4 r4Var = this.n;
        if (r4Var != null) {
            r4Var.run();
        }
        this.n = null;
    }
}
