package org.telegram.ui.Components;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
                jp0 jp0Var = (jp0) this.b;
                jp0Var.q = false;
                jp0Var.dismiss();
                break;
            case 3:
                kp0 kp0Var = (kp0) this.b;
                kp0Var.s = false;
                kp0Var.r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == kp0Var.f) {
                    kp0Var.f = null;
                    break;
                }
                break;
            case 4:
                vq0 vq0Var = (vq0) this.b;
                vq0Var.E.setVisibility(8);
                vq0Var.z0.setVisibility(8);
                sq0 sq0Var = vq0Var.L;
                sq0Var.f = null;
                sq0Var.l();
                vq0Var.B0 = null;
                vq0Var.M0 = false;
                break;
            default:
                vq0 vq0Var2 = ((cq0) this.b).d;
                vq0Var2.F.setVisibility(8);
                vq0Var2.G.setVisibility(8);
                vq0Var2.y0.setVisibility(8);
                vq0Var2.B0 = null;
                break;
        }
    }
}
