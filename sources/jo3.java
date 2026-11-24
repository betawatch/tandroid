// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class jo3 extends zfb {
    public int c;

    public jo3(int i) {
        super(0L, false);
        this.c = i;
    }

    public abstract fw2 d();

    public Throwable f(Object obj) {
        fp2 fp2Var = obj instanceof fp2 ? (fp2) obj : null;
        if (fp2Var != null) {
            return fp2Var.a;
        }
        return null;
    }

    public final void h(Throwable th) {
        c9e.a(d().getContext(), new ex2("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            fw2 d = d();
            d.getClass();
            ho3 ho3Var = (ho3) d;
            gw2 gw2Var = ho3Var.e;
            Object obj = ho3Var.h;
            sw2 context = gw2Var.getContext();
            Object c = edd.c(context, obj);
            bt5 bt5Var = null;
            y4c c2 = c != edd.a ? qzd.c(gw2Var, context, c) : null;
            try {
                sw2 context2 = gw2Var.getContext();
                Object i = i();
                Throwable f = f(i);
                if (f == null) {
                    int i2 = this.c;
                    boolean z = true;
                    if (i2 != 1 && i2 != 2) {
                        z = false;
                    }
                    if (z) {
                        bt5Var = (bt5) context2.get(pd5.c);
                    }
                }
                if (bt5Var != null && !bt5Var.isActive()) {
                    CancellationException cancellationException = bt5Var.getCancellationException();
                    c(cancellationException);
                    gw2Var.resumeWith(qse.a(cancellationException));
                } else if (f != null) {
                    gw2Var.resumeWith(new sa9(f));
                } else {
                    gw2Var.resumeWith(g(i));
                }
                if (c2 == null || c2.S()) {
                    edd.a(context, c);
                }
            } catch (Throwable th) {
                if (c2 == null || c2.S()) {
                    edd.a(context, c);
                }
                throw th;
            }
        } catch (Throwable th2) {
            h(th2);
        }
    }

    public void c(CancellationException cancellationException) {
    }

    public Object g(Object obj) {
        return obj;
    }
}
