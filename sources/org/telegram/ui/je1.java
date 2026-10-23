package org.telegram.ui;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
