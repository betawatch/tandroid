package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rn0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ oo0 d;

    public /* synthetic */ rn0(oo0 oo0Var, int i3) {
        this.c = i3;
        this.d = oo0Var;
    }

    @Override // g.p
    public final int i(int i3) {
        switch (this.c) {
            case 0:
                if (i3 == 0) {
                    return this.d.A1.J;
                }
                return 1;
            case 1:
                lo0 lo0Var = this.d.F1;
                return (i3 == lo0Var.x || i3 == lo0Var.y || i3 == lo0Var.E || i3 == lo0Var.G || lo0Var.d(i3) == 0) ? 4 : 1;
            default:
                if (i3 == 0) {
                    return this.d.B1.J;
                }
                return 1;
        }
    }
}
