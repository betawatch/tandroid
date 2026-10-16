package org.telegram.ui.Components;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jb implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                sc scVar = (sc) this.b;
                if (scVar.d == hVar) {
                    scVar.d = null;
                    break;
                }
                break;
            case 1:
                fb fbVar = (fb) this.b;
                if (!z10) {
                    fbVar.run();
                    break;
                }
                break;
            case 2:
                cl clVar = (cl) this.b;
                clVar.i0 = null;
                clVar.j0 = 1.0f;
                clVar.k0();
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
                ir0Var.E.setVisibility(8);
                ir0Var.z0.setVisibility(8);
                fr0 fr0Var = ir0Var.L;
                fr0Var.f = null;
                fr0Var.l();
                ir0Var.B0 = null;
                ir0Var.M0 = false;
                break;
            default:
                ir0 ir0Var2 = ((pq0) this.b).d;
                ir0Var2.F.setVisibility(8);
                ir0Var2.G.setVisibility(8);
                ir0Var2.y0.setVisibility(8);
                ir0Var2.B0 = null;
                break;
        }
    }
}
