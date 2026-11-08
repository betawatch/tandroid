package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
