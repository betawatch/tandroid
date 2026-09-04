package org.telegram.ui;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class cf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eg1 b;

    public /* synthetic */ cf1(eg1 eg1Var, int i10) {
        this.a = i10;
        this.b = eg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                eg1 eg1Var = this.b;
                eg1Var.x0();
                eg1Var.B0();
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
                eg1 eg1Var2 = this.b;
                eg1Var2.A0 = null;
                eg1Var2.U0(true, false);
                break;
            default:
                eg1 eg1Var3 = this.b;
                eg1Var3.N.postOnAnimation(new cf1(eg1Var3, 1));
                break;
        }
    }
}
