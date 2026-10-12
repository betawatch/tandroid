package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class r2 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                x2 x2Var = (x2) this.b;
                x2Var.G = f7;
                x2Var.c();
                break;
            case 1:
                i8 i8Var = (i8) this.b;
                i8Var.Y = f7;
                i8Var.A0();
                break;
            default:
                ((h8) this.b).c.setConversionWobble(f7);
                break;
        }
    }
}
