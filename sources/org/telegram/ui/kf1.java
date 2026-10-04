package org.telegram.ui;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lf1 b;

    public /* synthetic */ kf1(lf1 lf1Var, int i10) {
        this.a = i10;
        this.b = lf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lf1 lf1Var = this.b;
                lf1Var.F = null;
                if (lf1Var.G != -1) {
                    lf1Var.H.getNotificationCenter().onAnimationFinish(lf1Var.G);
                    lf1Var.G = -1;
                    break;
                }
                break;
            default:
                lf1 lf1Var2 = this.b;
                lf1Var2.F = null;
                if (lf1Var2.G != -1) {
                    lf1Var2.H.getNotificationCenter().onAnimationFinish(lf1Var2.G);
                    lf1Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
