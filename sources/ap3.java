// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class ap3 extends vjb {
    public int c;

    public ap3(int i) {
        super(0L, false);
        this.c = i;
    }

    public abstract zw2 d();

    public Throwable f(Object obj) {
        yp2 yp2Var = obj instanceof yp2 ? (yp2) obj : null;
        if (yp2Var != null) {
            return yp2Var.a;
        }
        return null;
    }

    public final void h(Throwable th) {
        sde.a(d().getContext(), new yx2("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zw2 d = d();
            d.getClass();
            yo3 yo3Var = (yo3) d;
            ax2 ax2Var = yo3Var.e;
            Object obj = yo3Var.h;
            mx2 context = ax2Var.getContext();
            Object c = xhd.c(context, obj);
            ev5 ev5Var = null;
            x8c c2 = c != xhd.a ? g4e.c(ax2Var, context, c) : null;
            try {
                mx2 context2 = ax2Var.getContext();
                Object i = i();
                Throwable f = f(i);
                if (f == null) {
                    int i2 = this.c;
                    boolean z = true;
                    if (i2 != 1 && i2 != 2) {
                        z = false;
                    }
                    if (z) {
                        ev5Var = (ev5) context2.get(qf5.c);
                    }
                }
                if (ev5Var != null && !ev5Var.isActive()) {
                    CancellationException cancellationException = ev5Var.getCancellationException();
                    c(cancellationException);
                    ax2Var.resumeWith(ixe.a(cancellationException));
                } else if (f != null) {
                    ax2Var.resumeWith(new ge9(f));
                } else {
                    ax2Var.resumeWith(g(i));
                }
                if (c2 == null || c2.S()) {
                    xhd.a(context, c);
                }
            } catch (Throwable th) {
                if (c2 == null || c2.S()) {
                    xhd.a(context, c);
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
