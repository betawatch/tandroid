package org.telegram.ui.Components;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                sp0 sp0Var = (sp0) this.b;
                sp0Var.q = false;
                sp0Var.dismiss();
                break;
            case 4:
                tp0 tp0Var = (tp0) this.b;
                tp0Var.s = false;
                tp0Var.r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == tp0Var.f) {
                    tp0Var.f = null;
                    break;
                }
                break;
            case 5:
                fr0 fr0Var = (fr0) this.b;
                fr0Var.F.setVisibility(8);
                fr0Var.A0.setVisibility(8);
                cr0 cr0Var = fr0Var.M;
                cr0Var.f = null;
                cr0Var.l();
                fr0Var.C0 = null;
                fr0Var.N0 = false;
                break;
            default:
                fr0 fr0Var2 = ((lq0) this.b).d;
                fr0Var2.G.setVisibility(8);
                fr0Var2.H.setVisibility(8);
                fr0Var2.z0.setVisibility(8);
                fr0Var2.C0 = null;
                break;
        }
    }
}
