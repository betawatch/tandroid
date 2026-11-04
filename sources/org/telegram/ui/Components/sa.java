package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sa implements q1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sa(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // q1.c
    public final void a(q1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                ac acVar = (ac) this.b;
                if (acVar.d == gVar) {
                    acVar.d = null;
                    break;
                }
                break;
            case 1:
                oa oaVar = (oa) this.b;
                if (!z10) {
                    oaVar.run();
                    break;
                }
                break;
            case 2:
                hk hkVar = (hk) this.b;
                hkVar.m0 = null;
                hkVar.n0 = 1.0f;
                hkVar.m0();
                break;
            case 3:
                en0 en0Var = (en0) this.b;
                en0Var.q = false;
                en0Var.dismiss();
                break;
            case 4:
                fn0 fn0Var = (fn0) this.b;
                fn0Var.s = false;
                fn0Var.r = false;
                if (!z10) {
                    gVar.d();
                }
                if (gVar == fn0Var.f) {
                    fn0Var.f = null;
                    break;
                }
                break;
            case 5:
                oo0 oo0Var = (oo0) this.b;
                oo0Var.x1.setVisibility(8);
                oo0Var.s2.setVisibility(8);
                mo0 mo0Var = oo0Var.E1;
                mo0Var.f = null;
                mo0Var.f();
                oo0Var.u2 = null;
                oo0Var.F2 = false;
                break;
            default:
                oo0 oo0Var2 = ((xn0) this.b).d;
                oo0Var2.y1.setVisibility(8);
                oo0Var2.z1.setVisibility(8);
                oo0Var2.r2.setVisibility(8);
                oo0Var2.u2 = null;
                break;
        }
    }
}
