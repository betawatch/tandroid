// default package

import android.view.WindowInsets;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class jzc extends mzc {
    public final WindowInsets.Builder c;

    public jzc(wzc wzcVar) {
        super(wzcVar);
        WindowInsets g = wzcVar.g();
        this.c = g != null ? ul1.i(g) : ul1.h();
    }

    @Override // mzc
    public wzc b() {
        a();
        wzc h = wzc.h(null, this.c.build());
        h.a.q(this.b);
        return h;
    }

    @Override // mzc
    public void d(iq5 iq5Var) {
        this.c.setMandatorySystemGestureInsets(iq5Var.d());
    }

    @Override // mzc
    public void e(iq5 iq5Var) {
        this.c.setStableInsets(iq5Var.d());
    }

    @Override // mzc
    public void f(iq5 iq5Var) {
        this.c.setSystemGestureInsets(iq5Var.d());
    }

    @Override // mzc
    public void g(iq5 iq5Var) {
        this.c.setSystemWindowInsets(iq5Var.d());
    }

    @Override // mzc
    public void h(iq5 iq5Var) {
        this.c.setTappableElementInsets(iq5Var.d());
    }

    public jzc() {
        this.c = ul1.h();
    }
}
