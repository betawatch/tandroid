package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class qn0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ no0 d;

    public /* synthetic */ qn0(no0 no0Var, int i7) {
        this.c = i7;
        this.d = no0Var;
    }

    @Override // g.p
    public final int i(int i7) {
        switch (this.c) {
            case 0:
                if (i7 == 0) {
                    return this.d.z1.J;
                }
                return 1;
            case 1:
                ko0 ko0Var = this.d.E1;
                return (i7 == ko0Var.x || i7 == ko0Var.y || i7 == ko0Var.D || i7 == ko0Var.F || ko0Var.d(i7) == 0) ? 4 : 1;
            default:
                if (i7 == 0) {
                    return this.d.A1.J;
                }
                return 1;
        }
    }
}
