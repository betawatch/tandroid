package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ie1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ je1 b;

    public /* synthetic */ ie1(je1 je1Var, int i10) {
        this.a = i10;
        this.b = je1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                je1 je1Var = this.b;
                je1Var.F = null;
                if (je1Var.G != -1) {
                    je1Var.H.getNotificationCenter().onAnimationFinish(je1Var.G);
                    je1Var.G = -1;
                    break;
                }
                break;
            default:
                je1 je1Var2 = this.b;
                je1Var2.F = null;
                if (je1Var2.G != -1) {
                    je1Var2.H.getNotificationCenter().onAnimationFinish(je1Var2.G);
                    je1Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
