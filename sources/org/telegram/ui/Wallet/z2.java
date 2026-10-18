package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z2 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                e3 e3Var = (e3) this.b;
                e3Var.G = f7;
                e3Var.c();
                break;
            case 1:
                o8 o8Var = (o8) this.b;
                o8Var.e = f7;
                o8Var.setScaleX(f7);
                o8Var.setScaleY(f7);
                break;
            case 2:
                o9 o9Var = (o9) this.b;
                o9Var.Y = f7;
                o9Var.A0();
                break;
            default:
                ((n9) this.b).c.setConversionWobble(f7);
                break;
        }
    }
}
