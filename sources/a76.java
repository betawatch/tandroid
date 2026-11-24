// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class a76 extends x1 {
    public final y66 a;
    public boolean b;
    public int c;

    public a76(y66 y66Var) {
        this.a = y66Var;
    }

    @Override // x1
    public final boolean b(gl0 gl0Var) {
        if (!(gl0Var instanceof f76)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.b = false;
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
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return il2.a(fq3Var.b);
    }
}
