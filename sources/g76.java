// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class g76 extends x1 {
    public final f76 a = new f76();
    public final int b;
    public boolean c;

    public g76(int i) {
        this.b = i;
    }

    @Override // x1
    public final boolean b(gl0 gl0Var) {
        if (!this.c) {
            return true;
        }
        return true;
    }

    @Override // x1
    public final gl0 e() {
        return this.a;
    }

    @Override // x1
    public final boolean f() {
        return true;
    }

    @Override // x1
    public final il2 h(fq3 fq3Var) {
        if (fq3Var.h) {
            if (((ui6) this.a.c) == null) {
                return null;
            }
            gl0 e = fq3Var.h().e();
            this.c = (e instanceof uw7) || (e instanceof f76);
            return il2.a(fq3Var.e);
        }
        int i = fq3Var.g;
        int i2 = this.b;
        if (i >= i2) {
            return new il2(-1, fq3Var.c + i2, false);
        }
        return null;
    }
}
