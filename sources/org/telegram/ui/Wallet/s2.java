package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                y2 y2Var = (y2) this.b;
                y2Var.G = f7;
                y2Var.c();
                break;
            case 1:
                j8 j8Var = (j8) this.b;
                j8Var.Y = f7;
                j8Var.A0();
                break;
            default:
                ((i8) this.b).c.setConversionWobble(f7);
                break;
        }
    }
}
