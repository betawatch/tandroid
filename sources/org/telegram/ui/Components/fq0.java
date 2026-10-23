package org.telegram.ui.Components;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class fq0 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ fr0 d;

    public /* synthetic */ fq0(fr0 fr0Var, int i10) {
        this.c = i10;
        this.d = fr0Var;
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
                br0 br0Var = this.d.N;
                return (i10 == br0Var.w || i10 == br0Var.x || i10 == br0Var.y || i10 == br0Var.F || br0Var.j(i10) == 0) ? 4 : 1;
        }
    }
}
