package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
