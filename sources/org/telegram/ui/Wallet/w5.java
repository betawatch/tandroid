package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class w5 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                b6.b((b6) this.b, z10, f7);
                break;
            default:
                i8 i8Var = (i8) this.b;
                i8Var.X = null;
                i8Var.Y = 1.0f;
                i8Var.A0();
                break;
        }
    }
}
