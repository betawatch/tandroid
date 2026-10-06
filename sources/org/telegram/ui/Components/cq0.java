package org.telegram.ui.Components;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class cq0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ br0 d;

    public /* synthetic */ cq0(br0 br0Var, int i10) {
        this.c = i10;
        this.d = br0Var;
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
                xq0 xq0Var = this.d.M;
                return (i10 == xq0Var.w || i10 == xq0Var.x || i10 == xq0Var.y || i10 == xq0Var.F || xq0Var.j(i10) == 0) ? 4 : 1;
            default:
                if (i10 == 0) {
                    return this.d.I.J;
                }
                return 1;
        }
    }
}
