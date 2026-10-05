package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class if1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jf1 b;

    public /* synthetic */ if1(jf1 jf1Var, int i10) {
        this.a = i10;
        this.b = jf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jf1 jf1Var = this.b;
                jf1Var.F = null;
                if (jf1Var.G != -1) {
                    jf1Var.H.getNotificationCenter().onAnimationFinish(jf1Var.G);
                    jf1Var.G = -1;
                    break;
                }
                break;
            default:
                jf1 jf1Var2 = this.b;
                jf1Var2.F = null;
                if (jf1Var2.G != -1) {
                    jf1Var2.H.getNotificationCenter().onAnimationFinish(jf1Var2.G);
                    jf1Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
