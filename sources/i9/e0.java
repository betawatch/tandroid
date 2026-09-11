package i9;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class e0 extends o implements RunnableFuture, g {
    public volatile d0 n;

    public e0(Callable callable) {
        this.n = new d0(this, callable);
    }

    @Override // i9.o
    public final void e() {
        d0 d0Var;
        Object obj = this.a;
        if ((obj instanceof a) && ((a) obj).a && (d0Var = this.n) != null) {
            androidx.emoji2.text.n nVar = d0.d;
            androidx.emoji2.text.n nVar2 = d0.c;
            Runnable runnable = (Runnable) d0Var.get();
            if (runnable instanceof Thread) {
                v vVar = new v(d0Var);
                v.a(vVar, Thread.currentThread());
                if (d0Var.compareAndSet(runnable, vVar)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) d0Var.getAndSet(nVar2)) == nVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.n = null;
    }

    @Override // i9.o, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof a;
    }

    @Override // i9.o
    public final String k() {
        d0 d0Var = this.n;
        if (d0Var == null) {
            return super.k();
        }
        return "task=[" + d0Var + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        d0 d0Var = this.n;
        if (d0Var != null) {
            d0Var.run();
        }
        this.n = null;
    }
}
