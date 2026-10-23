package org.telegram.ui.Components;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class jq0 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ ir0 d;

    public /* synthetic */ jq0(ir0 ir0Var, int i10) {
        this.c = i10;
        this.d = ir0Var;
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
                er0 er0Var = this.d.N;
                return (i10 == er0Var.w || i10 == er0Var.x || i10 == er0Var.y || i10 == er0Var.F || er0Var.j(i10) == 0) ? 4 : 1;
        }
    }
}
