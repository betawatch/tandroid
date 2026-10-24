package org.telegram.ui;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class je1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ke1 b;

    public /* synthetic */ je1(ke1 ke1Var, int i10) {
        this.a = i10;
        this.b = ke1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ke1 ke1Var = this.b;
                ke1Var.F = null;
                if (ke1Var.G != -1) {
                    ke1Var.H.getNotificationCenter().onAnimationFinish(ke1Var.G);
                    ke1Var.G = -1;
                    break;
                }
                break;
            default:
                ke1 ke1Var2 = this.b;
                ke1Var2.F = null;
                if (ke1Var2.G != -1) {
                    ke1Var2.H.getNotificationCenter().onAnimationFinish(ke1Var2.G);
                    ke1Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
