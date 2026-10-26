package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class oq0 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ mr0 d;

    public /* synthetic */ oq0(mr0 mr0Var, int i10) {
        this.c = i10;
        this.d = mr0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        switch (this.c) {
            case 0:
                if (i10 == 0) {
                    return this.d.I.J;
                }
                return 1;
            case 1:
                ir0 ir0Var = this.d.N;
                return (i10 == ir0Var.w || i10 == ir0Var.x || i10 == ir0Var.y || i10 == ir0Var.F || ir0Var.j(i10) == 0) ? 4 : 1;
            default:
                if (i10 == 0) {
                    return this.d.J.J;
                }
                return 1;
        }
    }
}
