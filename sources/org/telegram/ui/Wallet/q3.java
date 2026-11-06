package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q3 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                w3 w3Var = (w3) this.b;
                w3Var.G = f10;
                w3Var.c();
                break;
            case 1:
                p8 p8Var = (p8) this.b;
                p8Var.e = f10;
                p8Var.setScaleX(f10);
                p8Var.setScaleY(f10);
                break;
            case 2:
                n9 n9Var = (n9) this.b;
                n9Var.b0 = f10;
                n9Var.G0();
                break;
            default:
                ((m9) this.b).d.setConversionWobble(f10);
                break;
        }
    }
}
