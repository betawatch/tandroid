package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class mq0 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ jr0 d;

    public /* synthetic */ mq0(jr0 jr0Var, int i10) {
        this.c = i10;
        this.d = jr0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        switch (this.c) {
            case 0:
                if (i10 == 0) {
                    return this.d.H.J;
                }
                return 1;
            case 1:
                fr0 fr0Var = this.d.M;
                return (i10 == fr0Var.w || i10 == fr0Var.x || i10 == fr0Var.y || i10 == fr0Var.F || fr0Var.j(i10) == 0) ? 4 : 1;
            default:
                if (i10 == 0) {
                    return this.d.I.J;
                }
                return 1;
        }
    }
}
