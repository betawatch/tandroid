package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class db implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ db(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.i iVar, boolean z10, float f9, float f10) {
        switch (this.a) {
            case 0:
                mc mcVar = (mc) this.b;
                if (mcVar.d == iVar) {
                    mcVar.d = null;
                    break;
                }
                break;
            case 1:
                za zaVar = (za) this.b;
                if (!z10) {
                    zaVar.run();
                    break;
                }
                break;
            case 2:
                po0 po0Var = (po0) this.b;
                po0Var.q = false;
                po0Var.dismiss();
                break;
            case 3:
                qo0 qo0Var = (qo0) this.b;
                qo0Var.s = false;
                qo0Var.r = false;
                if (!z10) {
                    iVar.c();
                }
                if (iVar == qo0Var.f) {
                    qo0Var.f = null;
                    break;
                }
                break;
            case 4:
                dq0 dq0Var = (dq0) this.b;
                dq0Var.A.setVisibility(8);
                dq0Var.v0.setVisibility(8);
                aq0 aq0Var = dq0Var.H;
                aq0Var.f = null;
                aq0Var.l();
                dq0Var.x0 = null;
                dq0Var.I0 = false;
                break;
            default:
                dq0 dq0Var2 = ((jp0) this.b).d;
                dq0Var2.B.setVisibility(8);
                dq0Var2.C.setVisibility(8);
                dq0Var2.u0.setVisibility(8);
                dq0Var2.x0 = null;
                break;
        }
    }
}
