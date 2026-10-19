package org.telegram.ui.Components;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class eq0 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ er0 d;

    public /* synthetic */ eq0(er0 er0Var, int i10) {
        this.c = i10;
        this.d = er0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        switch (this.c) {
            case 0:
                if (i10 == 0) {
                    return this.d.J.J;
                }
                return 1;
            case 1:
                if (i10 == 0) {
                    return this.d.I.J;
                }
                return 1;
            default:
                ar0 ar0Var = this.d.N;
                return (i10 == ar0Var.w || i10 == ar0Var.x || i10 == ar0Var.y || i10 == ar0Var.F || ar0Var.j(i10) == 0) ? 4 : 1;
        }
    }
}
