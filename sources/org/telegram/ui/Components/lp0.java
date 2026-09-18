package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class lp0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ iq0 d;

    public /* synthetic */ lp0(iq0 iq0Var, int i10) {
        this.c = i10;
        this.d = iq0Var;
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
                eq0 eq0Var = this.d.M;
                return (i10 == eq0Var.w || i10 == eq0Var.x || i10 == eq0Var.y || i10 == eq0Var.F || eq0Var.j(i10) == 0) ? 4 : 1;
            default:
                if (i10 == 0) {
                    return this.d.I.J;
                }
                return 1;
        }
    }
}
