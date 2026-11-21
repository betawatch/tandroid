package m9;

import c8.t9;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class p extends s implements Runnable {
    public y n;
    public g9.k r;

    @Override // m9.o
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

    @Override // m9.o
    public final String k() {
        String str;
        y yVar = this.n;
        g9.k kVar = this.r;
        String k10 = super.k();
        if (yVar != null) {
            str = "inputFuture=[" + yVar + "], ";
        } else {
            str = "";
        }
        if (kVar == null) {
            if (k10 != null) {
                return p5.c.v(str, k10);
            }
            return null;
        }
        return str + "function=[" + kVar + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        y yVar = this.n;
        g9.k kVar = this.r;
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
                Object apply = kVar.apply(t9.a(yVar));
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
        } catch (Error e10) {
            n(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            n(e11.getCause());
        } catch (Exception e12) {
            n(e12);
        }
    }
}
