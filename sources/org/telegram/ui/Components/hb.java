package org.telegram.ui.Components;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
                ip0 ip0Var = (ip0) this.b;
                ip0Var.q = false;
                ip0Var.dismiss();
                break;
            case 3:
                jp0 jp0Var = (jp0) this.b;
                jp0Var.s = false;
                jp0Var.r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == jp0Var.f) {
                    jp0Var.f = null;
                    break;
                }
                break;
            case 4:
                uq0 uq0Var = (uq0) this.b;
                uq0Var.E.setVisibility(8);
                uq0Var.z0.setVisibility(8);
                rq0 rq0Var = uq0Var.L;
                rq0Var.f = null;
                rq0Var.l();
                uq0Var.B0 = null;
                uq0Var.M0 = false;
                break;
            default:
                uq0 uq0Var2 = ((bq0) this.b).d;
                uq0Var2.F.setVisibility(8);
                uq0Var2.G.setVisibility(8);
                uq0Var2.y0.setVisibility(8);
                uq0Var2.B0 = null;
                break;
        }
    }
}
