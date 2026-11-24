// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class mf1 extends kse {
    public k27 a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public final /* synthetic */ nf1 f;

    public mf1(nf1 nf1Var) {
        this.f = nf1Var;
    }

    @Override // kse
    public final void a() {
        k27 k27Var = this.a;
        nf1 nf1Var = this.f;
        if (k27Var != null) {
            int indexOf = nf1Var.p0.indexOf(k27Var) + nf1Var.F.f;
            if (indexOf >= 0) {
                nf1Var.y.h1(indexOf, this.e, false);
            }
        } else {
            nf1Var.y.h1(this.b, this.d, this.c);
        }
        this.a = null;
        nf1Var.W = true;
        nf1Var.h1();
        gl.d3(new nv0(this, (byte) 22));
    }

    @Override // kse
    public final void c() {
        nf1 nf1Var = this.f;
        nf1Var.K0 = nf1Var.getNotificationCenter().q(nf1.R0, nf1Var.K0, true);
    }

    @Override // kse
    public final void d(View view) {
        if (view instanceof gb2) {
            this.f.h.add((gb2) view);
        }
    }
}
