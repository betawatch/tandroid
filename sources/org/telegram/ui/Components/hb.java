package org.telegram.ui.Components;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class hb implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                qc qcVar = (qc) this.b;
                if (qcVar.d == hVar) {
                    qcVar.d = null;
                    break;
                }
                break;
            case 1:
                db dbVar = (db) this.b;
                if (!z10) {
                    dbVar.run();
                    break;
                }
                break;
            case 2:
                vo0 vo0Var = (vo0) this.b;
                vo0Var.q = false;
                vo0Var.dismiss();
                break;
            case 3:
                xo0 xo0Var = (xo0) this.b;
                xo0Var.s = false;
                xo0Var.r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == xo0Var.f) {
                    xo0Var.f = null;
                    break;
                }
                break;
            case 4:
                hq0 hq0Var = (hq0) this.b;
                hq0Var.E.setVisibility(8);
                hq0Var.z0.setVisibility(8);
                eq0 eq0Var = hq0Var.L;
                eq0Var.f = null;
                eq0Var.l();
                hq0Var.B0 = null;
                hq0Var.M0 = false;
                break;
            default:
                hq0 hq0Var2 = ((op0) this.b).d;
                hq0Var2.F.setVisibility(8);
                hq0Var2.G.setVisibility(8);
                hq0Var2.y0.setVisibility(8);
                hq0Var2.B0 = null;
                break;
        }
    }
}
