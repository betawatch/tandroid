package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p3 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                v3 v3Var = (v3) this.b;
                v3Var.G = f10;
                v3Var.c();
                break;
            case 1:
                o8 o8Var = (o8) this.b;
                o8Var.e = f10;
                o8Var.setScaleX(f10);
                o8Var.setScaleY(f10);
                break;
            case 2:
                m9 m9Var = (m9) this.b;
                m9Var.b0 = f10;
                m9Var.G0();
                break;
            default:
                ((l9) this.b).d.setConversionWobble(f10);
                break;
        }
    }
}
