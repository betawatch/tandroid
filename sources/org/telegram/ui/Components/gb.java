package org.telegram.ui.Components;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                ip0 ip0Var = (ip0) this.b;
                ip0Var.q = false;
                ip0Var.dismiss();
                break;
            case 3:
                jp0 jp0Var = (jp0) this.b;
                jp0Var.s = false;
                jp0Var.r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == jp0Var.f) {
                    jp0Var.f = null;
                    break;
                }
                break;
            case 4:
                uq0 uq0Var = (uq0) this.b;
                uq0Var.E.setVisibility(8);
                uq0Var.z0.setVisibility(8);
                rq0 rq0Var = uq0Var.L;
                rq0Var.f = null;
                rq0Var.l();
                uq0Var.B0 = null;
                uq0Var.M0 = false;
                break;
            default:
                uq0 uq0Var2 = ((bq0) this.b).d;
                uq0Var2.F.setVisibility(8);
                uq0Var2.G.setVisibility(8);
                uq0Var2.y0.setVisibility(8);
                uq0Var2.B0 = null;
                break;
        }
    }
}
