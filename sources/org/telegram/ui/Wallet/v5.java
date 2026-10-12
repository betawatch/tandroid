package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class v5 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6 b;

    public /* synthetic */ v5(b6 b6Var, int i10) {
        this.a = i10;
        this.b = b6Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                b6 b6Var = this.b;
                b6Var.c.setScaleX(f7);
                b6Var.c.setScaleY(f7);
                break;
            default:
                this.b.P = f10;
                break;
        }
    }
}
