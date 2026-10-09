package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
