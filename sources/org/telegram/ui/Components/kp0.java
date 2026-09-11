package org.telegram.ui.Components;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
