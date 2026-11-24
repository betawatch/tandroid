// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class b2 extends pt5 implements fw2, ax2 {
    public final sw2 d;

    public b2(sw2 sw2Var, boolean z) {
        super(z);
        y((bt5) sw2Var.get(pd5.c));
        this.d = sw2Var.plus(this);
    }

    @Override // pt5
    public String D() {
        return super.D();
    }

    @Override // pt5
    public final void G(Object obj) {
        if (!(obj instanceof fp2)) {
            Q(obj);
        } else {
            fp2 fp2Var = (fp2) obj;
            P(fp2Var.a, ex.a.getIntVolatile(fp2Var, fp2.b) != 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(dx2 dx2Var, b2 b2Var, eq4 eq4Var) {
        int ordinal = dx2Var.ordinal();
        g5c g5cVar = g5c.a;
        if (ordinal == 0) {
            try {
                r3c.c(dle.a(((of0) eq4Var).create(b2Var, this)), g5cVar);
                return;
            } finally {
                resumeWith(new sa9(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                dle.a(((of0) eq4Var).create(b2Var, this)).resumeWith(g5cVar);
                return;
            }
            if (ordinal != 3) {
                throw new gp2();
            }
            try {
                sw2 sw2Var = this.d;
                Object c = edd.c(sw2Var, null);
                try {
                    r3c.a(2, eq4Var);
                    Object invoke = eq4Var.invoke(b2Var, this);
                    if (invoke != bx2.a) {
                        resumeWith(invoke);
                    }
                } finally {
                    edd.a(sw2Var, c);
                }
            } catch (Throwable th) {
            }
        }
    }

    @Override // ax2
    public final sw2 c() {
        return this.d;
    }

    @Override // fw2
    public final sw2 getContext() {
        return this.d;
    }

    @Override // pt5
    public final String l() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // fw2
    public final void resumeWith(Object obj) {
        Throwable a = ta9.a(obj);
        if (a != null) {
            obj = new fp2(a, false);
        }
        Object C = C(obj);
        if (C == fad.b) {
            return;
        }
        g(C);
    }

    @Override // pt5
    public final void x(gp2 gp2Var) {
        c9e.a(this.d, gp2Var);
    }

    public void Q(Object obj) {
    }

    public void P(Throwable th, boolean z) {
    }
}
