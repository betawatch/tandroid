// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class b2 extends ov5 implements px2, ky2 {
    public final cy2 d;

    public b2(cy2 cy2Var, boolean z) {
        super(z);
        y((av5) cy2Var.get(nf5.c));
        this.d = cy2Var.plus(this);
    }

    @Override // ov5
    public String D() {
        return super.D();
    }

    @Override // ov5
    public final void G(Object obj) {
        if (!(obj instanceof qq2)) {
            Q(obj);
        } else {
            qq2 qq2Var = (qq2) obj;
            P(qq2Var.a, fy.a.getIntVolatile(qq2Var, qq2.b) != 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(ny2 ny2Var, b2 b2Var, fs4 fs4Var) {
        int ordinal = ny2Var.ordinal();
        g7c g7cVar = g7c.a;
        if (ordinal == 0) {
            try {
                r5c.c(fne.a(((og0) fs4Var).create(b2Var, this)), g7cVar);
                return;
            } finally {
                resumeWith(new sc9(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                fne.a(((og0) fs4Var).create(b2Var, this)).resumeWith(g7cVar);
                return;
            }
            if (ordinal != 3) {
                throw new rq2();
            }
            try {
                cy2 cy2Var = this.d;
                Object c = gfd.c(cy2Var, null);
                try {
                    r5c.a(2, fs4Var);
                    Object invoke = fs4Var.invoke(b2Var, this);
                    if (invoke != ly2.a) {
                        resumeWith(invoke);
                    }
                } finally {
                    gfd.a(cy2Var, c);
                }
            } catch (Throwable th) {
            }
        }
    }

    @Override // ky2
    public final cy2 c() {
        return this.d;
    }

    @Override // px2
    public final cy2 getContext() {
        return this.d;
    }

    @Override // ov5
    public final String l() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // px2
    public final void resumeWith(Object obj) {
        Throwable a = tc9.a(obj);
        if (a != null) {
            obj = new qq2(a, false);
        }
        Object C = C(obj);
        if (C == hcd.b) {
            return;
        }
        g(C);
    }

    @Override // ov5
    public final void x(rq2 rq2Var) {
        dbe.a(this.d, rq2Var);
    }

    public void Q(Object obj) {
    }

    public void P(Throwable th, boolean z) {
    }
}
