package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class p4 extends c4 implements RunnableFuture {
    public volatile o4 n;

    public p4(Callable callable) {
        this.n = new o4(this, callable);
    }

    @Override // com.google.android.gms.internal.cast.c4
    public final String a() {
        o4 o4Var = this.n;
        return o4Var != null ? a8.p0.p("task=[", o4Var.toString(), "]") : super.a();
    }

    @Override // com.google.android.gms.internal.cast.c4
    public final void d() {
        o4 o4Var;
        Object obj = this.a;
        if ((obj instanceof u3) && ((u3) obj).a && (o4Var = this.n) != null) {
            h4 h4Var = o4.d;
            h4 h4Var2 = o4.c;
            Runnable runnable = (Runnable) o4Var.get();
            if (runnable instanceof Thread) {
                g4 g4Var = new g4(o4Var);
                g4Var.setExclusiveOwnerThread(Thread.currentThread());
                if (o4Var.compareAndSet(runnable, g4Var)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) o4Var.getAndSet(h4Var2)) == h4Var) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th2) {
                        if (((Runnable) o4Var.getAndSet(h4Var2)) == h4Var) {
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
        o4 o4Var = this.n;
        if (o4Var != null) {
            o4Var.run();
        }
        this.n = null;
    }
}
