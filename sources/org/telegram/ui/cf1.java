package org.telegram.ui;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
