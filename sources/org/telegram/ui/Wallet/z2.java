package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                f3 f3Var = (f3) this.b;
                f3Var.G = f7;
                f3Var.c();
                break;
            case 1:
                j8 j8Var = (j8) this.b;
                j8Var.e = f7;
                j8Var.setScaleX(f7);
                j8Var.setScaleY(f7);
                break;
            case 2:
                j9 j9Var = (j9) this.b;
                j9Var.a0 = f7;
                j9Var.B0();
                break;
            default:
                ((i9) this.b).d.setConversionWobble(f7);
                break;
        }
    }
}
