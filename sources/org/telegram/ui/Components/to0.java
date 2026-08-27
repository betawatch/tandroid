package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class to0 extends f2.w {
    public final /* synthetic */ int c;
    public final /* synthetic */ sp0 d;

    public /* synthetic */ to0(sp0 sp0Var, int i10) {
        this.c = i10;
        this.d = sp0Var;
    }

    @Override // f2.w
    public final int i(int i10) {
        switch (this.c) {
            case 0:
                if (i10 == 0) {
                    return this.d.D.J;
                }
                return 1;
            case 1:
                op0 op0Var = this.d.I;
                return (i10 == op0Var.w || i10 == op0Var.x || i10 == op0Var.y || i10 == op0Var.B || op0Var.j(i10) == 0) ? 4 : 1;
            default:
                if (i10 == 0) {
                    return this.d.E.J;
                }
                return 1;
        }
    }
}
