// default package

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class d4 extends bl4 implements Runnable {
    public t56 n;
    public Object r;

    public static d4 o(t56 t56Var, aq4 aq4Var) {
        d4 d4Var = new d4();
        t56Var.getClass();
        d4Var.n = t56Var;
        d4Var.r = aq4Var;
        t56Var.b(d4Var, vn3.a);
        return d4Var;
    }

    @Override // t2
    public final void d() {
        t56 t56Var = this.n;
        boolean z = false;
        if ((t56Var != null) & (this.a instanceof h2)) {
            Object obj = this.a;
            if ((obj instanceof h2) && ((h2) obj).a) {
                z = true;
            }
            t56Var.cancel(z);
        }
        this.n = null;
        this.r = null;
    }

    @Override // t2
    public final String j() {
        String str;
        t56 t56Var = this.n;
        Object obj = this.r;
        String j = super.j();
        if (t56Var != null) {
            str = "inputFuture=[" + t56Var + "], ";
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
        t56 t56Var = this.n;
        Object obj = this.r;
        if (((this.a instanceof h2) | (t56Var == null)) || (obj == null)) {
            return;
        }
        this.n = null;
        if (t56Var.isCancelled()) {
            n(t56Var);
            return;
        }
        try {
            try {
                Object apply = ((aq4) obj).apply(jie.a(t56Var));
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
