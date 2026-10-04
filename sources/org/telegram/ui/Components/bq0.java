package org.telegram.ui.Components;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class bq0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ zq0 d;

    public /* synthetic */ bq0(zq0 zq0Var, int i10) {
        this.c = i10;
        this.d = zq0Var;
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
                vq0 vq0Var = this.d.M;
                return (i10 == vq0Var.w || i10 == vq0Var.x || i10 == vq0Var.y || i10 == vq0Var.F || vq0Var.j(i10) == 0) ? 4 : 1;
            default:
                if (i10 == 0) {
                    return this.d.I.J;
                }
                return 1;
        }
    }
}
