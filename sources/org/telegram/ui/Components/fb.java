package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fb implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                oc ocVar = (oc) this.b;
                if (ocVar.d == hVar) {
                    ocVar.d = null;
                    break;
                }
                break;
            case 1:
                bb bbVar = (bb) this.b;
                if (!z10) {
                    bbVar.run();
                    break;
                }
                break;
            case 2:
                vo0 vo0Var = (vo0) this.b;
                vo0Var.q = false;
                vo0Var.dismiss();
                break;
            case 3:
                wo0 wo0Var = (wo0) this.b;
                wo0Var.s = false;
                wo0Var.r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == wo0Var.f) {
                    wo0Var.f = null;
                    break;
                }
                break;
            case 4:
                hq0 hq0Var = (hq0) this.b;
                hq0Var.E.setVisibility(8);
                hq0Var.z0.setVisibility(8);
                eq0 eq0Var = hq0Var.L;
                eq0Var.f = null;
                eq0Var.l();
                hq0Var.B0 = null;
                hq0Var.M0 = false;
                break;
            default:
                hq0 hq0Var2 = ((op0) this.b).d;
                hq0Var2.F.setVisibility(8);
                hq0Var2.G.setVisibility(8);
                hq0Var2.y0.setVisibility(8);
                hq0Var2.B0 = null;
                break;
        }
    }
}
