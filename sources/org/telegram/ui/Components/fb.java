package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                wo0 wo0Var = (wo0) this.b;
                wo0Var.q = false;
                wo0Var.dismiss();
                break;
            case 3:
                xo0 xo0Var = (xo0) this.b;
                xo0Var.s = false;
                xo0Var.r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == xo0Var.f) {
                    xo0Var.f = null;
                    break;
                }
                break;
            case 4:
                iq0 iq0Var = (iq0) this.b;
                iq0Var.E.setVisibility(8);
                iq0Var.z0.setVisibility(8);
                fq0 fq0Var = iq0Var.L;
                fq0Var.f = null;
                fq0Var.l();
                iq0Var.B0 = null;
                iq0Var.M0 = false;
                break;
            default:
                iq0 iq0Var2 = ((pp0) this.b).d;
                iq0Var2.F.setVisibility(8);
                iq0Var2.G.setVisibility(8);
                iq0Var2.y0.setVisibility(8);
                iq0Var2.B0 = null;
                break;
        }
    }
}
