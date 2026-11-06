package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
