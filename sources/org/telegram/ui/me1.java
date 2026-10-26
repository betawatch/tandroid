package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class me1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ne1 b;

    public /* synthetic */ me1(ne1 ne1Var, int i10) {
        this.a = i10;
        this.b = ne1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ne1 ne1Var = this.b;
                ne1Var.F = null;
                if (ne1Var.G != -1) {
                    ne1Var.H.getNotificationCenter().onAnimationFinish(ne1Var.G);
                    ne1Var.G = -1;
                    break;
                }
                break;
            default:
                ne1 ne1Var2 = this.b;
                ne1Var2.F = null;
                if (ne1Var2.G != -1) {
                    ne1Var2.H.getNotificationCenter().onAnimationFinish(ne1Var2.G);
                    ne1Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
