package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class jf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lg1 b;

    public /* synthetic */ jf1(lg1 lg1Var, int i10) {
        this.a = i10;
        this.b = lg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lg1 lg1Var = this.b;
                lg1Var.x0();
                lg1Var.B0();
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
                lg1 lg1Var2 = this.b;
                lg1Var2.A0 = null;
                lg1Var2.U0(true, false);
                break;
            default:
                lg1 lg1Var3 = this.b;
                lg1Var3.N.postOnAnimation(new jf1(lg1Var3, 1));
                break;
        }
    }
}
