package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lc1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rc1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ lc1(rc1 rc1Var, byte[] bArr, int i10) {
        this.a = i10;
        this.b = rc1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rc1.d0(this.b, this.c);
                break;
            default:
                rc1 rc1Var = this.b;
                rc1Var.B0();
                rc1Var.V = this.c;
                rc1Var.getMessagesController().h4(0L, "VALIDATE_PASSWORD");
                rc1 rc1Var2 = new rc1(9, rc1Var.U);
                rc1Var2.H = rc1Var.H;
                rc1Var2.G = rc1Var.G;
                rc1Var.presentFragment(rc1Var2, true);
                break;
        }
    }
}
