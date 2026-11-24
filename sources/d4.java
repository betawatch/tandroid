// default package

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class d4 extends bn4 implements Runnable {
    public t76 n;
    public Object r;

    public static d4 o(t76 t76Var, bs4 bs4Var) {
        d4 d4Var = new d4();
        t76Var.getClass();
        d4Var.n = t76Var;
        d4Var.r = bs4Var;
        t76Var.b(d4Var, fp3.a);
        return d4Var;
    }

    @Override // t2
    public final void d() {
        t76 t76Var = this.n;
        boolean z = false;
        if ((t76Var != null) & (this.a instanceof h2)) {
            Object obj = this.a;
            if ((obj instanceof h2) && ((h2) obj).a) {
                z = true;
            }
            t76Var.cancel(z);
        }
        this.n = null;
        this.r = null;
    }

    @Override // t2
    public final String j() {
        String str;
        t76 t76Var = this.n;
        Object obj = this.r;
        String j = super.j();
        if (t76Var != null) {
            str = "inputFuture=[" + t76Var + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (j != null) {
                return str.concat(j);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        t76 t76Var = this.n;
        Object obj = this.r;
        if (((this.a instanceof h2) | (t76Var == null)) || (obj == null)) {
            return;
        }
        this.n = null;
        if (t76Var.isCancelled()) {
            n(t76Var);
            return;
        }
        try {
            try {
                Object apply = ((bs4) obj).apply(kke.a(t76Var));
                this.r = null;
                l(apply);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    m(th);
                } finally {
                    this.r = null;
                }
            }
        } catch (Error e) {
            m(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            m(e2.getCause());
        } catch (Exception e3) {
            m(e3);
        }
    }
}
