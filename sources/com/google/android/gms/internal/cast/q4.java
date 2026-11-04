package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q4 extends d4 implements RunnableFuture {
    public volatile p4 n;

    public q4(Callable callable) {
        this.n = new p4(this, callable);
    }

    @Override // com.google.android.gms.internal.cast.d4
    public final String a() {
        p4 p4Var = this.n;
        return p4Var != null ? a1.g.q("task=[", p4Var.toString(), "]") : super.a();
    }

    @Override // com.google.android.gms.internal.cast.d4
    public final void e() {
        p4 p4Var;
        Object obj = this.a;
        if ((obj instanceof v3) && ((v3) obj).a && (p4Var = this.n) != null) {
            i4 i4Var = p4.d;
            i4 i4Var2 = p4.c;
            Runnable runnable = (Runnable) p4Var.get();
            if (runnable instanceof Thread) {
                h4 h4Var = new h4(p4Var);
                h4Var.setExclusiveOwnerThread(Thread.currentThread());
                if (p4Var.compareAndSet(runnable, h4Var)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) p4Var.getAndSet(i4Var2)) == i4Var) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th2) {
                        if (((Runnable) p4Var.getAndSet(i4Var2)) == i4Var) {
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
        p4 p4Var = this.n;
        if (p4Var != null) {
            p4Var.run();
        }
        this.n = null;
    }
}
