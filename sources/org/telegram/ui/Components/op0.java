package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class op0 extends f2.v {
    public final /* synthetic */ int c;
    public final /* synthetic */ mq0 d;

    public /* synthetic */ op0(mq0 mq0Var, int i10) {
        this.c = i10;
        this.d = mq0Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        switch (this.c) {
            case 0:
                if (i10 == 0) {
                    return this.d.E.J;
                }
                return 1;
            case 1:
                iq0 iq0Var = this.d.J;
                return (i10 == iq0Var.w || i10 == iq0Var.x || i10 == iq0Var.y || i10 == iq0Var.C || iq0Var.j(i10) == 0) ? 4 : 1;
            default:
                if (i10 == 0) {
                    return this.d.F.J;
                }
                return 1;
        }
    }
}
