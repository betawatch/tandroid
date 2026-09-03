package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ff1 b;

    public /* synthetic */ ef1(ff1 ff1Var, int i10) {
        this.a = i10;
        this.b = ff1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ff1 ff1Var = this.b;
                ff1Var.F = null;
                if (ff1Var.G != -1) {
                    ff1Var.H.getNotificationCenter().onAnimationFinish(ff1Var.G);
                    ff1Var.G = -1;
                    break;
                }
                break;
            default:
                ff1 ff1Var2 = this.b;
                ff1Var2.F = null;
                if (ff1Var2.G != -1) {
                    ff1Var2.H.getNotificationCenter().onAnimationFinish(ff1Var2.G);
                    ff1Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
