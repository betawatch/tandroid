package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class u4 extends h4 implements RunnableFuture {
    public volatile t4 n;

    public u4(Callable callable) {
        this.n = new t4(this, callable);
    }

    @Override // com.google.android.gms.internal.cast.h4
    public final String c() {
        t4 t4Var = this.n;
        return t4Var != null ? a4.a.p("task=[", t4Var.toString(), "]") : super.c();
    }

    @Override // com.google.android.gms.internal.cast.h4
    public final void e() {
        t4 t4Var;
        Object obj = this.a;
        if ((obj instanceof z3) && ((z3) obj).a && (t4Var = this.n) != null) {
            m4 m4Var = t4.d;
            m4 m4Var2 = t4.c;
            Runnable runnable = (Runnable) t4Var.get();
            if (runnable instanceof Thread) {
                l4 l4Var = new l4(t4Var);
                l4Var.setExclusiveOwnerThread(Thread.currentThread());
                if (t4Var.compareAndSet(runnable, l4Var)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) t4Var.getAndSet(m4Var2)) == m4Var) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th2) {
                        if (((Runnable) t4Var.getAndSet(m4Var2)) == m4Var) {
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
        t4 t4Var = this.n;
        if (t4Var != null) {
            t4Var.run();
        }
        this.n = null;
    }
}
