package k2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i implements w0 {
    public final u1 a;
    public final r0 b;
    public b c;
    public w0 d;
    public boolean e;
    public boolean f;

    public i(r0 r0Var, g2.h0 h0Var) {
        this.b = r0Var;
        u1 u1Var = new u1();
        u1Var.d = h0Var;
        u1Var.e = d2.y0.d;
        this.a = u1Var;
        this.e = true;
    }

    @Override // k2.w0
    public final long a() {
        if (this.e) {
            return this.a.a();
        }
        w0 w0Var = this.d;
        w0Var.getClass();
        return w0Var.a();
    }

    @Override // k2.w0
    public final boolean b() {
        if (this.e) {
            this.a.getClass();
            return false;
        }
        w0 w0Var = this.d;
        w0Var.getClass();
        return w0Var.b();
    }

    @Override // k2.w0
    public final void c(d2.y0 y0Var) {
        w0 w0Var = this.d;
        if (w0Var != null) {
            w0Var.c(y0Var);
            y0Var = this.d.g();
        }
        this.a.c(y0Var);
    }

    public final void d(b bVar) {
        w0 w0Var;
        w0 i3 = bVar.i();
        if (i3 == null || i3 == (w0Var = this.d)) {
            return;
        }
        if (w0Var != null) {
            throw new l(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.d = i3;
        this.c = bVar;
        i3.c((d2.y0) this.a.e);
    }

    @Override // k2.w0
    public final d2.y0 g() {
        w0 w0Var = this.d;
        return w0Var != null ? w0Var.g() : (d2.y0) this.a.e;
    }
}
