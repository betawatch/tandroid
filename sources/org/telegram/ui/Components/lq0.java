package org.telegram.ui.Components;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class lq0 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ ir0 d;

    public /* synthetic */ lq0(ir0 ir0Var, int i10) {
        this.c = i10;
        this.d = ir0Var;
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
                er0 er0Var = this.d.M;
                return (i10 == er0Var.w || i10 == er0Var.x || i10 == er0Var.y || i10 == er0Var.F || er0Var.j(i10) == 0) ? 4 : 1;
            default:
                if (i10 == 0) {
                    return this.d.I.J;
                }
                return 1;
        }
    }
}
