package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bb1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cb1 b;

    public /* synthetic */ bb1(cb1 cb1Var, int i10) {
        this.a = i10;
        this.b = cb1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cb1 cb1Var = this.b;
                cb1Var.F = null;
                if (cb1Var.G != -1) {
                    cb1Var.H.getNotificationCenter().j(cb1Var.G);
                    cb1Var.G = -1;
                    break;
                }
                break;
            default:
                cb1 cb1Var2 = this.b;
                cb1Var2.F = null;
                if (cb1Var2.G != -1) {
                    cb1Var2.H.getNotificationCenter().j(cb1Var2.G);
                    cb1Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
