package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y2 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                d3 d3Var = (d3) this.b;
                d3Var.G = f7;
                d3Var.c();
                break;
            case 1:
                l8 l8Var = (l8) this.b;
                l8Var.e = f7;
                l8Var.setScaleX(f7);
                l8Var.setScaleY(f7);
                break;
            case 2:
                l9 l9Var = (l9) this.b;
                l9Var.Y = f7;
                l9Var.A0();
                break;
            default:
                ((k9) this.b).c.setConversionWobble(f7);
                break;
        }
    }
}
