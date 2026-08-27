package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q4 extends e4 implements RunnableFuture {
    public volatile p4 n;

    public q4(Callable callable) {
        this.n = new p4(this, callable);
    }

    @Override // com.google.android.gms.internal.cast.e4
    public final String b() {
        p4 p4Var = this.n;
        return p4Var != null ? a9.p.m("task=[", p4Var.toString(), "]") : super.b();
    }

    @Override // com.google.android.gms.internal.cast.e4
    public final void c() {
        p4 p4Var;
        Object obj = this.a;
        if ((obj instanceof w3) && ((w3) obj).a && (p4Var = this.n) != null) {
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
                    } catch (Throwable th) {
                        if (((Runnable) p4Var.getAndSet(i4Var2)) == i4Var) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
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
