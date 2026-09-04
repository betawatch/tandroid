package org.telegram.ui.Components;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class kp0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ hq0 d;

    public /* synthetic */ kp0(hq0 hq0Var, int i10) {
        this.c = i10;
        this.d = hq0Var;
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
                dq0 dq0Var = this.d.M;
                return (i10 == dq0Var.w || i10 == dq0Var.x || i10 == dq0Var.y || i10 == dq0Var.F || dq0Var.j(i10) == 0) ? 4 : 1;
            default:
                if (i10 == 0) {
                    return this.d.I.J;
                }
                return 1;
        }
    }
}
