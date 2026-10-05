package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
