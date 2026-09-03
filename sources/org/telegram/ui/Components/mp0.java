package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class mp0 extends f2.v {
    public final /* synthetic */ int c;
    public final /* synthetic */ lq0 d;

    public /* synthetic */ mp0(lq0 lq0Var, int i10) {
        this.c = i10;
        this.d = lq0Var;
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
                hq0 hq0Var = this.d.J;
                return (i10 == hq0Var.w || i10 == hq0Var.x || i10 == hq0Var.y || i10 == hq0Var.C || hq0Var.j(i10) == 0) ? 4 : 1;
            default:
                if (i10 == 0) {
                    return this.d.F.J;
                }
                return 1;
        }
    }
}
