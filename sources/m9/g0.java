package m9;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class g0 extends s implements RunnableFuture {
    public volatile f0 n;

    public g0(Callable callable) {
        this.n = new f0(this, callable);
    }

    @Override // m9.o
    public final void d() {
        f0 f0Var;
        Object obj = this.a;
        if ((obj instanceof a) && ((a) obj).a && (f0Var = this.n) != null) {
            androidx.emoji2.text.o oVar = f0.d;
            androidx.emoji2.text.o oVar2 = f0.c;
            Runnable runnable = (Runnable) f0Var.get();
            if (runnable instanceof Thread) {
                x xVar = new x(f0Var);
                x.a(xVar, Thread.currentThread());
                if (f0Var.compareAndSet(runnable, xVar)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) f0Var.getAndSet(oVar2)) == oVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.n = null;
    }

    @Override // m9.o
    public final String k() {
        f0 f0Var = this.n;
        if (f0Var == null) {
            return super.k();
        }
        return "task=[" + f0Var + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        f0 f0Var = this.n;
        if (f0Var != null) {
            f0Var.run();
        }
        this.n = null;
    }
}
