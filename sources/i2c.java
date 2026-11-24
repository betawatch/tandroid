// default package

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class i2c extends bl4 implements RunnableFuture {
    public volatile h2c n;

    public i2c(Callable callable) {
        this.n = new h2c(this, callable);
    }

    @Override // t2
    public final void d() {
        h2c h2cVar;
        Object obj = this.a;
        if ((obj instanceof h2) && ((h2) obj).a && (h2cVar = this.n) != null) {
            sv svVar = h2c.e;
            sv svVar2 = h2c.d;
            Runnable runnable = (Runnable) h2cVar.get();
            if (runnable instanceof Thread) {
                qp5 qp5Var = new qp5(h2cVar);
                qp5Var.a(Thread.currentThread());
                if (h2cVar.compareAndSet(runnable, qp5Var)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) h2cVar.getAndSet(svVar2)) == svVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.n = null;
    }

    @Override // t2
    public final String j() {
        h2c h2cVar = this.n;
        if (h2cVar == null) {
            return super.j();
        }
        return "task=[" + h2cVar + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        h2c h2cVar = this.n;
        if (h2cVar != null) {
            h2cVar.run();
        }
        this.n = null;
    }
}
