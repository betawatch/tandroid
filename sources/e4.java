// default package

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class e4 extends gn4 implements Runnable {
    public x76 n;
    public Object r;

    public static e4 o(x76 x76Var, es4 es4Var) {
        e4 e4Var = new e4();
        x76Var.getClass();
        e4Var.n = x76Var;
        e4Var.r = es4Var;
        x76Var.b(e4Var, mo3.a);
        return e4Var;
    }

    @Override // u2
    public final void d() {
        x76 x76Var = this.n;
        boolean z = false;
        if ((x76Var != null) & (this.a instanceof i2)) {
            Object obj = this.a;
            if ((obj instanceof i2) && ((i2) obj).a) {
                z = true;
            }
            x76Var.cancel(z);
        }
        this.n = null;
        this.r = null;
    }

    @Override // u2
    public final String j() {
        String str;
        x76 x76Var = this.n;
        Object obj = this.r;
        String j = super.j();
        if (x76Var != null) {
            str = "inputFuture=[" + x76Var + "], ";
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
        x76 x76Var = this.n;
        Object obj = this.r;
        if (((this.a instanceof i2) | (x76Var == null)) || (obj == null)) {
            return;
        }
        this.n = null;
        if (x76Var.isCancelled()) {
            n(x76Var);
            return;
        }
        try {
            try {
                Object apply = ((es4) obj).apply(fne.a(x76Var));
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
