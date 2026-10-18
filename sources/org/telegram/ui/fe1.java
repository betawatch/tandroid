package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fe1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ge1 b;

    public /* synthetic */ fe1(ge1 ge1Var, int i10) {
        this.a = i10;
        this.b = ge1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ge1 ge1Var = this.b;
                ge1Var.F = null;
                if (ge1Var.G != -1) {
                    ge1Var.H.getNotificationCenter().onAnimationFinish(ge1Var.G);
                    ge1Var.G = -1;
                    break;
                }
                break;
            default:
                ge1 ge1Var2 = this.b;
                ge1Var2.F = null;
                if (ge1Var2.G != -1) {
                    ge1Var2.H.getNotificationCenter().onAnimationFinish(ge1Var2.G);
                    ge1Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
