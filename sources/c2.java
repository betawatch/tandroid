// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class c2 extends sv5 implements zw2, ux2 {
    public final mx2 d;

    public c2(mx2 mx2Var, boolean z) {
        super(z);
        y((ev5) mx2Var.get(qf5.c));
        this.d = mx2Var.plus(this);
    }

    @Override // sv5
    public String D() {
        return super.D();
    }

    @Override // sv5
    public final void G(Object obj) {
        if (!(obj instanceof yp2)) {
            Q(obj);
        } else {
            yp2 yp2Var = (yp2) obj;
            P(yp2Var.a, fx.a.getIntVolatile(yp2Var, yp2.b) != 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(xx2 xx2Var, c2 c2Var, is4 is4Var) {
        int ordinal = xx2Var.ordinal();
        g9c g9cVar = g9c.a;
        if (ordinal == 0) {
            try {
                q7c.c(xpe.a(((qf0) is4Var).create(c2Var, this)), g9cVar);
                return;
            } finally {
                resumeWith(new ge9(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                xpe.a(((qf0) is4Var).create(c2Var, this)).resumeWith(g9cVar);
                return;
            }
            if (ordinal != 3) {
                throw new zp2();
            }
            try {
                mx2 mx2Var = this.d;
                Object c = xhd.c(mx2Var, null);
                try {
                    q7c.a(2, is4Var);
                    Object invoke = is4Var.invoke(c2Var, this);
                    if (invoke != vx2.a) {
                        resumeWith(invoke);
                    }
                } finally {
                    xhd.a(mx2Var, c);
                }
            } catch (Throwable th) {
            }
        }
    }

    @Override // ux2
    public final mx2 c() {
        return this.d;
    }

    @Override // zw2
    public final mx2 getContext() {
        return this.d;
    }

    @Override // sv5
    public final String l() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // zw2
    public final void resumeWith(Object obj) {
        Throwable a = he9.a(obj);
        if (a != null) {
            obj = new yp2(a, false);
        }
        Object C = C(obj);
        if (C == yed.b) {
            return;
        }
        g(C);
    }

    @Override // sv5
    public final void x(zp2 zp2Var) {
        sde.a(this.d, zp2Var);
    }

    public void Q(Object obj) {
    }

    public void P(Throwable th, boolean z) {
    }
}
