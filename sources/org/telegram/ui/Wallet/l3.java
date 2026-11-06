package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p3 b;

    public /* synthetic */ l3(p3 p3Var, int i7) {
        this.a = i7;
        this.b = p3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p3 p3Var = this.b;
                if (!p3Var.S && !p3Var.R) {
                    p3Var.a(1.0f);
                    break;
                }
                break;
            default:
                p3 p3Var2 = this.b;
                if (!p3Var2.S && !p3Var2.R) {
                    ih.d.c(p3Var2.E, p3Var2.h);
                    p3Var2.F.d();
                    h6 h6Var = p3Var2.r;
                    l3 l3Var = new l3(p3Var2, 0);
                    c6 c6Var = h6Var.D;
                    if (c6Var == null) {
                        l3Var.run();
                        break;
                    } else if (c6Var.b == null) {
                        c6Var.d = l3Var;
                        break;
                    } else {
                        l3Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
