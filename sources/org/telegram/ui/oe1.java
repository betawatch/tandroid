package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oe1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pe1 b;

    public /* synthetic */ oe1(pe1 pe1Var, int i10) {
        this.a = i10;
        this.b = pe1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pe1 pe1Var = this.b;
                pe1Var.F = null;
                if (pe1Var.G != -1) {
                    pe1Var.H.getNotificationCenter().onAnimationFinish(pe1Var.G);
                    pe1Var.G = -1;
                    break;
                }
                break;
            default:
                pe1 pe1Var2 = this.b;
                pe1Var2.F = null;
                if (pe1Var2.G != -1) {
                    pe1Var2.H.getNotificationCenter().onAnimationFinish(pe1Var2.G);
                    pe1Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
