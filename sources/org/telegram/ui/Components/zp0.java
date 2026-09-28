package org.telegram.ui.Components;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
