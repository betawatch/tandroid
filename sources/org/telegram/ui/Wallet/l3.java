package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p3 b;

    public /* synthetic */ l3(p3 p3Var, int i10) {
        this.a = i10;
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
                    yg.d.c(p3Var2.E, p3Var2.h);
                    p3Var2.F.d();
                    l6 l6Var = p3Var2.r;
                    l3 l3Var = new l3(p3Var2, 0);
                    g6 g6Var = l6Var.D;
                    if (g6Var == null) {
                        l3Var.run();
                        break;
                    } else if (g6Var.b == null) {
                        g6Var.d = l3Var;
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
