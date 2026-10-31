package i2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i implements x0 {
    public final w1 a;
    public final s0 b;
    public b c;
    public x0 d;
    public boolean e;
    public boolean f;

    public i(s0 s0Var, e2.g0 g0Var) {
        this.b = s0Var;
        w1 w1Var = new w1();
        w1Var.d = g0Var;
        w1Var.e = b2.z0.d;
        this.a = w1Var;
        this.e = true;
    }

    @Override // i2.x0
    public final long a() {
        if (this.e) {
            return this.a.a();
        }
        x0 x0Var = this.d;
        x0Var.getClass();
        return x0Var.a();
    }

    @Override // i2.x0
    public final boolean b() {
        if (this.e) {
            this.a.getClass();
            return false;
        }
        x0 x0Var = this.d;
        x0Var.getClass();
        return x0Var.b();
    }

    @Override // i2.x0
    public final void c(b2.z0 z0Var) {
        x0 x0Var = this.d;
        if (x0Var != null) {
            x0Var.c(z0Var);
            z0Var = this.d.g();
        }
        this.a.c(z0Var);
    }

    public final void d(b bVar) {
        x0 x0Var;
        x0 i10 = bVar.i();
        if (i10 == null || i10 == (x0Var = this.d)) {
            return;
        }
        if (x0Var != null) {
            throw new l(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.d = i10;
        this.c = bVar;
        i10.c((b2.z0) this.a.e);
    }

    @Override // i2.x0
    public final b2.z0 g() {
        x0 x0Var = this.d;
        return x0Var != null ? x0Var.g() : (b2.z0) this.a.e;
    }
}
