package org.telegram.ui.Components;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                al alVar = (al) this.b;
                alVar.i0 = null;
                alVar.j0 = 1.0f;
                alVar.k0();
                break;
            case 3:
                rp0 rp0Var = (rp0) this.b;
                rp0Var.q = false;
                rp0Var.dismiss();
                break;
            case 4:
                sp0 sp0Var = (sp0) this.b;
                sp0Var.s = false;
                sp0Var.r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == sp0Var.f) {
                    sp0Var.f = null;
                    break;
                }
                break;
            case 5:
                er0 er0Var = (er0) this.b;
                er0Var.F.setVisibility(8);
                er0Var.A0.setVisibility(8);
                br0 br0Var = er0Var.M;
                br0Var.f = null;
                br0Var.l();
                er0Var.C0 = null;
                er0Var.N0 = false;
                break;
            default:
                er0 er0Var2 = ((kq0) this.b).d;
                er0Var2.G.setVisibility(8);
                er0Var2.H.setVisibility(8);
                er0Var2.z0.setVisibility(8);
                er0Var2.C0 = null;
                break;
        }
    }
}
