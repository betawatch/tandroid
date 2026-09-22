package org.telegram.ui.Components;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class zp0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ wq0 d;

    public /* synthetic */ zp0(wq0 wq0Var, int i10) {
        this.c = i10;
        this.d = wq0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        switch (this.c) {
            case 0:
                if (i10 == 0) {
                    return this.d.H.J;
                }
                return 1;
            case 1:
                sq0 sq0Var = this.d.M;
                return (i10 == sq0Var.w || i10 == sq0Var.x || i10 == sq0Var.y || i10 == sq0Var.F || sq0Var.j(i10) == 0) ? 4 : 1;
            default:
                if (i10 == 0) {
                    return this.d.I.J;
                }
                return 1;
        }
    }
}
