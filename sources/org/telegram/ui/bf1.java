package org.telegram.ui;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class bf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg1 b;

    public /* synthetic */ bf1(dg1 dg1Var, int i10) {
        this.a = i10;
        this.b = dg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dg1 dg1Var = this.b;
                dg1Var.x0();
                dg1Var.B0();
                break;
            case 1:
                this.b.x0();
                break;
            case 2:
                this.b.O0(true);
                break;
            case 3:
                this.b.finishPreviewFragment();
                break;
            case 4:
                dg1 dg1Var2 = this.b;
                dg1Var2.A0 = null;
                dg1Var2.U0(true, false);
                break;
            default:
                dg1 dg1Var3 = this.b;
                dg1Var3.N.postOnAnimation(new bf1(dg1Var3, 1));
                break;
        }
    }
}
