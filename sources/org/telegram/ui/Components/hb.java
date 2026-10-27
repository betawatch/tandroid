package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                alVar.l0 = null;
                alVar.m0 = 1.0f;
                alVar.k0();
                break;
            case 3:
                cq0 cq0Var = (cq0) this.b;
                cq0Var.q = false;
                cq0Var.dismiss();
                break;
            case 4:
                dq0 dq0Var = (dq0) this.b;
                dq0Var.s = false;
                dq0Var.r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == dq0Var.f) {
                    dq0Var.f = null;
                    break;
                }
                break;
            case 5:
                nr0 nr0Var = (nr0) this.b;
                nr0Var.F.setVisibility(8);
                nr0Var.A0.setVisibility(8);
                kr0 kr0Var = nr0Var.M;
                kr0Var.f = null;
                kr0Var.l();
                nr0Var.C0 = null;
                nr0Var.N0 = false;
                break;
            default:
                nr0 nr0Var2 = ((uq0) this.b).d;
                nr0Var2.G.setVisibility(8);
                nr0Var2.H.setVisibility(8);
                nr0Var2.z0.setVisibility(8);
                nr0Var2.C0 = null;
                break;
        }
    }
}
