package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                q8 q8Var = (q8) this.b;
                q8Var.e = f10;
                q8Var.setScaleX(f10);
                q8Var.setScaleY(f10);
                break;
            case 2:
                o9 o9Var = (o9) this.b;
                o9Var.b0 = f10;
                o9Var.G0();
                break;
            default:
                ((n9) this.b).d.setConversionWobble(f10);
                break;
        }
    }
}
