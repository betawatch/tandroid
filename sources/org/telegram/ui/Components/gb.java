package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                fp0 fp0Var = (fp0) this.b;
                fp0Var.q = false;
                fp0Var.dismiss();
                break;
            case 3:
                hp0 hp0Var = (hp0) this.b;
                hp0Var.s = false;
                hp0Var.r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == hp0Var.f) {
                    hp0Var.f = null;
                    break;
                }
                break;
            case 4:
                sq0 sq0Var = (sq0) this.b;
                sq0Var.E.setVisibility(8);
                sq0Var.z0.setVisibility(8);
                pq0 pq0Var = sq0Var.L;
                pq0Var.f = null;
                pq0Var.l();
                sq0Var.B0 = null;
                sq0Var.M0 = false;
                break;
            default:
                sq0 sq0Var2 = ((yp0) this.b).d;
                sq0Var2.F.setVisibility(8);
                sq0Var2.G.setVisibility(8);
                sq0Var2.y0.setVisibility(8);
                sq0Var2.B0 = null;
                break;
        }
    }
}
