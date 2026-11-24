// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class bab implements q21 {
    public final float[] a = new float[2];
    public final /* synthetic */ cab b;

    public bab(cab cabVar) {
        this.b = cabVar;
    }

    @Override // q21
    public final boolean a() {
        return true;
    }

    @Override // q21
    public final boolean d() {
        return true;
    }

    @Override // q21
    public final int e(int i) {
        oab oabVar = this.b.y0;
        a58 w = oabVar.w();
        if (w == null) {
            return 0;
        }
        g48 g48Var = w.S0;
        cab cabVar = oabVar.s;
        float[] fArr = this.a;
        gm.p1(g48Var, cabVar, fArr);
        return (int) (r3.getMeasuredHeight() - (fArr[1] + g48Var.getMeasuredHeight()));
    }

    @Override // q21
    public final boolean f(int i) {
        return false;
    }

    @Override // q21
    public final int h(int i) {
        return 0;
    }

    @Override // q21
    public final void b(float f) {
    }

    @Override // q21
    public final void c(u31 u31Var) {
    }

    @Override // q21
    public final void g(u31 u31Var) {
    }
}
