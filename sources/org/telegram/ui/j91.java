package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k91 b;

    public /* synthetic */ j91(k91 k91Var, int i7) {
        this.a = i7;
        this.b = k91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k91 k91Var = this.b;
                k91Var.F = null;
                if (k91Var.G != -1) {
                    k91Var.H.getNotificationCenter().j(k91Var.G);
                    k91Var.G = -1;
                    break;
                }
                break;
            default:
                k91 k91Var2 = this.b;
                k91Var2.F = null;
                if (k91Var2.G != -1) {
                    k91Var2.H.getNotificationCenter().j(k91Var2.G);
                    k91Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
