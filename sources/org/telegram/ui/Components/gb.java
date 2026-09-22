package org.telegram.ui.Components;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class gb implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                pc pcVar = (pc) this.b;
                if (pcVar.d == hVar) {
                    pcVar.d = null;
                    break;
                }
                break;
            case 1:
                cb cbVar = (cb) this.b;
                if (!z10) {
                    cbVar.run();
                    break;
                }
                break;
            case 2:
                kp0 kp0Var = (kp0) this.b;
                kp0Var.q = false;
                kp0Var.dismiss();
                break;
            case 3:
                lp0 lp0Var = (lp0) this.b;
                lp0Var.s = false;
                lp0Var.r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == lp0Var.f) {
                    lp0Var.f = null;
                    break;
                }
                break;
            case 4:
                wq0 wq0Var = (wq0) this.b;
                wq0Var.E.setVisibility(8);
                wq0Var.z0.setVisibility(8);
                tq0 tq0Var = wq0Var.L;
                tq0Var.f = null;
                tq0Var.l();
                wq0Var.B0 = null;
                wq0Var.M0 = false;
                break;
            default:
                wq0 wq0Var2 = ((dq0) this.b).d;
                wq0Var2.F.setVisibility(8);
                wq0Var2.G.setVisibility(8);
                wq0Var2.y0.setVisibility(8);
                wq0Var2.B0 = null;
                break;
        }
    }
}
