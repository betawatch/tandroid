package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q3 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                w3 w3Var = (w3) this.b;
                w3Var.G = f7;
                w3Var.c();
                break;
            case 1:
                u8 u8Var = (u8) this.b;
                u8Var.e = f7;
                u8Var.setScaleX(f7);
                u8Var.setScaleY(f7);
                break;
            case 2:
                r9 r9Var = (r9) this.b;
                r9Var.b0 = f7;
                r9Var.G0();
                break;
            default:
                ((q9) this.b).d.setConversionWobble(f7);
                break;
        }
    }
}
