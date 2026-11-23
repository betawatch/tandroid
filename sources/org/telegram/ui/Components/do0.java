package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class do0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ ap0 d;

    public /* synthetic */ do0(ap0 ap0Var, int i7) {
        this.c = i7;
        this.d = ap0Var;
    }

    @Override // g.p
    public final int i(int i7) {
        switch (this.c) {
            case 0:
                if (i7 == 0) {
                    return this.d.D1.J;
                }
                return 1;
            case 1:
                xo0 xo0Var = this.d.I1;
                return (i7 == xo0Var.x || i7 == xo0Var.y || i7 == xo0Var.E || i7 == xo0Var.G || xo0Var.d(i7) == 0) ? 4 : 1;
            default:
                if (i7 == 0) {
                    return this.d.E1.J;
                }
                return 1;
        }
    }
}
