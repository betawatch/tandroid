package org.telegram.ui.Components;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class yp0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ vq0 d;

    public /* synthetic */ yp0(vq0 vq0Var, int i10) {
        this.c = i10;
        this.d = vq0Var;
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
                rq0 rq0Var = this.d.M;
                return (i10 == rq0Var.w || i10 == rq0Var.x || i10 == rq0Var.y || i10 == rq0Var.F || rq0Var.j(i10) == 0) ? 4 : 1;
            default:
                if (i10 == 0) {
                    return this.d.I.J;
                }
                return 1;
        }
    }
}
