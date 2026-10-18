package j9;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class g0 extends s implements RunnableFuture {
    public volatile f0 n;

    public g0(Callable callable) {
        this.n = new f0(this, callable);
    }

    @Override // j9.o
    public final void d() {
        f0 f0Var;
        Object obj = this.a;
        if ((obj instanceof a) && ((a) obj).a && (f0Var = this.n) != null) {
            androidx.emoji2.text.n nVar = f0.d;
            androidx.emoji2.text.n nVar2 = f0.c;
            Runnable runnable = (Runnable) f0Var.get();
            if (runnable instanceof Thread) {
                x xVar = new x(f0Var);
                x.a(xVar, Thread.currentThread());
                if (f0Var.compareAndSet(runnable, xVar)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) f0Var.getAndSet(nVar2)) == nVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.n = null;
    }

    @Override // j9.o
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
