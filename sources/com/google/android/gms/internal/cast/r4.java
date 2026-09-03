package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class r4 extends e4 implements RunnableFuture {
    public volatile q4 n;

    public r4(Callable callable) {
        this.n = new q4(this, callable);
    }

    @Override // com.google.android.gms.internal.cast.e4
    public final String b() {
        q4 q4Var = this.n;
        return q4Var != null ? android.support.v4.media.a.o("task=[", q4Var.toString(), "]") : super.b();
    }

    @Override // com.google.android.gms.internal.cast.e4
    public final void c() {
        q4 q4Var;
        Object obj = this.a;
        if ((obj instanceof w3) && ((w3) obj).a && (q4Var = this.n) != null) {
            j4 j4Var = q4.d;
            j4 j4Var2 = q4.c;
            Runnable runnable = (Runnable) q4Var.get();
            if (runnable instanceof Thread) {
                i4 i4Var = new i4(q4Var);
                i4Var.setExclusiveOwnerThread(Thread.currentThread());
                if (q4Var.compareAndSet(runnable, i4Var)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) q4Var.getAndSet(j4Var2)) == j4Var) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th2) {
                        if (((Runnable) q4Var.getAndSet(j4Var2)) == j4Var) {
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
        q4 q4Var = this.n;
        if (q4Var != null) {
            q4Var.run();
        }
        this.n = null;
    }
}
