package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
