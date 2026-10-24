package org.telegram.ui.Components;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                wp0 wp0Var = (wp0) this.b;
                wp0Var.q = false;
                wp0Var.dismiss();
                break;
            case 4:
                xp0 xp0Var = (xp0) this.b;
                xp0Var.s = false;
                xp0Var.r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == xp0Var.f) {
                    xp0Var.f = null;
                    break;
                }
                break;
            case 5:
                ir0 ir0Var = (ir0) this.b;
                ir0Var.F.setVisibility(8);
                ir0Var.A0.setVisibility(8);
                fr0 fr0Var = ir0Var.M;
                fr0Var.f = null;
                fr0Var.l();
                ir0Var.C0 = null;
                ir0Var.N0 = false;
                break;
            default:
                ir0 ir0Var2 = ((pq0) this.b).d;
                ir0Var2.G.setVisibility(8);
                ir0Var2.H.setVisibility(8);
                ir0Var2.z0.setVisibility(8);
                ir0Var2.C0 = null;
                break;
        }
    }
}
