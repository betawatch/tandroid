package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ le1 b;

    public /* synthetic */ ke1(le1 le1Var, int i10) {
        this.a = i10;
        this.b = le1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                le1 le1Var = this.b;
                le1Var.F = null;
                if (le1Var.G != -1) {
                    le1Var.H.getNotificationCenter().onAnimationFinish(le1Var.G);
                    le1Var.G = -1;
                    break;
                }
                break;
            default:
                le1 le1Var2 = this.b;
                le1Var2.F = null;
                if (le1Var2.G != -1) {
                    le1Var2.H.getNotificationCenter().onAnimationFinish(le1Var2.G);
                    le1Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
