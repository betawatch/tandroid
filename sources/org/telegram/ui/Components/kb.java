package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kb implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                tc tcVar = (tc) this.b;
                if (tcVar.d == hVar) {
                    tcVar.d = null;
                    break;
                }
                break;
            case 1:
                gb gbVar = (gb) this.b;
                if (!z10) {
                    gbVar.run();
                    break;
                }
                break;
            case 2:
                gl glVar = (gl) this.b;
                glVar.i0 = null;
                glVar.j0 = 1.0f;
                glVar.k0();
                break;
            case 3:
                aq0 aq0Var = (aq0) this.b;
                aq0Var.q = false;
                aq0Var.dismiss();
                break;
            case 4:
                bq0 bq0Var = (bq0) this.b;
                bq0Var.s = false;
                bq0Var.r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == bq0Var.f) {
                    bq0Var.f = null;
                    break;
                }
                break;
            case 5:
                mr0 mr0Var = (mr0) this.b;
                mr0Var.E.setVisibility(8);
                mr0Var.z0.setVisibility(8);
                jr0 jr0Var = mr0Var.L;
                jr0Var.f = null;
                jr0Var.l();
                mr0Var.B0 = null;
                mr0Var.M0 = false;
                break;
            default:
                mr0 mr0Var2 = ((tq0) this.b).d;
                mr0Var2.F.setVisibility(8);
                mr0Var2.G.setVisibility(8);
                mr0Var2.y0.setVisibility(8);
                mr0Var2.B0 = null;
                break;
        }
    }
}
