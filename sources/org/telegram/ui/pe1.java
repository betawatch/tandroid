package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sf1 b;

    public /* synthetic */ pe1(sf1 sf1Var, int i10) {
        this.a = i10;
        this.b = sf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sf1 sf1Var = this.b;
                sf1Var.x0();
                sf1Var.B0();
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
                sf1 sf1Var2 = this.b;
                sf1Var2.x0 = null;
                sf1Var2.U0(true, false);
                break;
            default:
                sf1 sf1Var3 = this.b;
                sf1Var3.K.postOnAnimation(new pe1(sf1Var3, 1));
                break;
        }
    }
}
