// default package

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class i4c extends bn4 implements RunnableFuture {
    public volatile h4c n;

    public i4c(Callable callable) {
        this.n = new h4c(this, callable);
    }

    @Override // t2
    public final void d() {
        h4c h4cVar;
        Object obj = this.a;
        if ((obj instanceof h2) && ((h2) obj).a && (h4cVar = this.n) != null) {
            sw swVar = h4c.e;
            sw swVar2 = h4c.d;
            Runnable runnable = (Runnable) h4cVar.get();
            if (runnable instanceof Thread) {
                qr5 qr5Var = new qr5(h4cVar);
                qr5Var.a(Thread.currentThread());
                if (h4cVar.compareAndSet(runnable, qr5Var)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) h4cVar.getAndSet(swVar2)) == swVar) {
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
        h4c h4cVar = this.n;
        if (h4cVar == null) {
            return super.j();
        }
        return "task=[" + h4cVar + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        h4c h4cVar = this.n;
        if (h4cVar != null) {
            h4cVar.run();
        }
        this.n = null;
    }
}
