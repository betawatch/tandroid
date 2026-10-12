package j9;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import v7.q8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class p extends s implements Runnable {
    public y n;
    public d9.k r;

    @Override // j9.o
    public final void d() {
        y yVar = this.n;
        boolean z10 = false;
        if ((yVar != null) & (this.a instanceof a)) {
            Object obj = this.a;
            if ((obj instanceof a) && ((a) obj).a) {
                z10 = true;
            }
            yVar.cancel(z10);
        }
        this.n = null;
        this.r = null;
    }

    @Override // j9.o
    public final String k() {
        String str;
        y yVar = this.n;
        d9.k kVar = this.r;
        String k10 = super.k();
        if (yVar != null) {
            str = "inputFuture=[" + yVar + "], ";
        } else {
            str = "";
        }
        if (kVar == null) {
            if (k10 != null) {
                return t8.b.u(str, k10);
            }
            return null;
        }
        return str + "function=[" + kVar + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        y yVar = this.n;
        d9.k kVar = this.r;
        if (((this.a instanceof a) | (yVar == null)) || (kVar == null)) {
            return;
        }
        this.n = null;
        if (yVar.isCancelled()) {
            o(yVar);
            return;
        }
        try {
            try {
                Object apply = kVar.apply(q8.a(yVar));
                this.r = null;
                m(apply);
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    n(th2);
                } finally {
                    this.r = null;
                }
            }
        } catch (Error e) {
            n(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e7) {
            n(e7.getCause());
        } catch (Exception e10) {
            n(e10);
        }
    }
}
