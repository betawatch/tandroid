// default package

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class edf extends vbf implements RunnableFuture {
    public volatile h2c n;

    public edf(Callable callable) {
        this.n = new h2c(this, callable);
    }

    @Override // vbf
    public final String a() {
        h2c h2cVar = this.n;
        return h2cVar != null ? tb4.y("task=[", h2cVar.toString(), "]") : super.a();
    }

    @Override // vbf
    public final void d() {
        h2c h2cVar;
        Object obj = this.a;
        if ((obj instanceof nbf) && ((nbf) obj).a && (h2cVar = this.n) != null) {
            sv svVar = h2c.h;
            sv svVar2 = h2c.f;
            Runnable runnable = (Runnable) h2cVar.get();
            if (runnable instanceof Thread) {
                jcf jcfVar = new jcf(h2cVar);
                jcfVar.setExclusiveOwnerThread(Thread.currentThread());
                if (h2cVar.compareAndSet(runnable, jcfVar)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) h2cVar.getAndSet(svVar2)) == svVar) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) h2cVar.getAndSet(svVar2)) == svVar) {
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
        h2c h2cVar = this.n;
        if (h2cVar != null) {
            h2cVar.run();
        }
        this.n = null;
    }
}
