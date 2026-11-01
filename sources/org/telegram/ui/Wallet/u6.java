package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u6 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ a7 b;

    public /* synthetic */ u6(a7 a7Var, int i10) {
        this.a = i10;
        this.b = a7Var;
    }

    @Override // o1.g
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                a7 a7Var = this.b;
                a7Var.c.setScaleX(f7);
                a7Var.c.setScaleY(f7);
                break;
            default:
                this.b.P = f10;
                break;
        }
    }
}
