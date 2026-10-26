package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                bq0 bq0Var = (bq0) this.b;
                bq0Var.q = false;
                bq0Var.dismiss();
                break;
            case 4:
                cq0 cq0Var = (cq0) this.b;
                cq0Var.s = false;
                cq0Var.r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == cq0Var.f) {
                    cq0Var.f = null;
                    break;
                }
                break;
            case 5:
                mr0 mr0Var = (mr0) this.b;
                mr0Var.F.setVisibility(8);
                mr0Var.A0.setVisibility(8);
                jr0 jr0Var = mr0Var.M;
                jr0Var.f = null;
                jr0Var.l();
                mr0Var.C0 = null;
                mr0Var.N0 = false;
                break;
            default:
                mr0 mr0Var2 = ((tq0) this.b).d;
                mr0Var2.G.setVisibility(8);
                mr0Var2.H.setVisibility(8);
                mr0Var2.z0.setVisibility(8);
                mr0Var2.C0 = null;
                break;
        }
    }
}
