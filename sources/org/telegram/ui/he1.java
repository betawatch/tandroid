package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class he1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ie1 b;

    public /* synthetic */ he1(ie1 ie1Var, int i9) {
        this.a = i9;
        this.b = ie1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ie1 ie1Var = this.b;
                ie1Var.F = null;
                if (ie1Var.G != -1) {
                    ie1Var.H.getNotificationCenter().onAnimationFinish(ie1Var.G);
                    ie1Var.G = -1;
                    break;
                }
                break;
            default:
                ie1 ie1Var2 = this.b;
                ie1Var2.F = null;
                if (ie1Var2.G != -1) {
                    ie1Var2.H.getNotificationCenter().onAnimationFinish(ie1Var2.G);
                    ie1Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
