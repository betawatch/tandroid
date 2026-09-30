package org.telegram.ui.Components;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
                kp0 kp0Var = (kp0) this.b;
                kp0Var.q = false;
                kp0Var.dismiss();
                break;
            case 3:
                lp0 lp0Var = (lp0) this.b;
                lp0Var.s = false;
                lp0Var.r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == lp0Var.f) {
                    lp0Var.f = null;
                    break;
                }
                break;
            case 4:
                wq0 wq0Var = (wq0) this.b;
                wq0Var.E.setVisibility(8);
                wq0Var.z0.setVisibility(8);
                tq0 tq0Var = wq0Var.L;
                tq0Var.f = null;
                tq0Var.l();
                wq0Var.B0 = null;
                wq0Var.M0 = false;
                break;
            default:
                wq0 wq0Var2 = ((dq0) this.b).d;
                wq0Var2.F.setVisibility(8);
                wq0Var2.G.setVisibility(8);
                wq0Var2.y0.setVisibility(8);
                wq0Var2.B0 = null;
                break;
        }
    }
}
