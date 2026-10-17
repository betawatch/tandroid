package org.telegram.ui.Components;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
                dr0 dr0Var = (dr0) this.b;
                dr0Var.E.setVisibility(8);
                dr0Var.z0.setVisibility(8);
                ar0 ar0Var = dr0Var.L;
                ar0Var.f = null;
                ar0Var.l();
                dr0Var.B0 = null;
                dr0Var.M0 = false;
                break;
            default:
                dr0 dr0Var2 = ((kq0) this.b).d;
                dr0Var2.F.setVisibility(8);
                dr0Var2.G.setVisibility(8);
                dr0Var2.y0.setVisibility(8);
                dr0Var2.B0 = null;
                break;
        }
    }
}
