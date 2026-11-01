package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class la1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nb1 b;

    public /* synthetic */ la1(nb1 nb1Var, int i10) {
        this.a = i10;
        this.b = nb1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nb1 nb1Var = this.b;
                nb1Var.B0();
                nb1Var.F0();
                break;
            case 1:
                this.b.B0();
                break;
            case 2:
                this.b.S0(true);
                break;
            case 3:
                this.b.finishPreviewFragment();
                break;
            case 4:
                nb1 nb1Var2 = this.b;
                nb1Var2.A0 = null;
                nb1Var2.Z0(true, false);
                break;
            default:
                nb1 nb1Var3 = this.b;
                nb1Var3.N.postOnAnimation(new la1(nb1Var3, 1));
                break;
        }
    }
}
