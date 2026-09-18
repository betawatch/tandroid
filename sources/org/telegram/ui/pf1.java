package org.telegram.ui;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qf1 b;

    public /* synthetic */ pf1(qf1 qf1Var, int i10) {
        this.a = i10;
        this.b = qf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qf1 qf1Var = this.b;
                qf1Var.F = null;
                if (qf1Var.G != -1) {
                    qf1Var.H.getNotificationCenter().onAnimationFinish(qf1Var.G);
                    qf1Var.G = -1;
                    break;
                }
                break;
            default:
                qf1 qf1Var2 = this.b;
                qf1Var2.F = null;
                if (qf1Var2.G != -1) {
                    qf1Var2.H.getNotificationCenter().onAnimationFinish(qf1Var2.G);
                    qf1Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
