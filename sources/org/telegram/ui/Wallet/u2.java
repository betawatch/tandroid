package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y2 b;

    public /* synthetic */ u2(y2 y2Var, int i10) {
        this.a = i10;
        this.b = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y2 y2Var = this.b;
                if (!y2Var.S && !y2Var.R) {
                    y2Var.a(1.0f);
                    break;
                }
                break;
            default:
                y2 y2Var2 = this.b;
                if (!y2Var2.S && !y2Var2.R) {
                    hh.d.c(y2Var2.E, y2Var2.h);
                    y2Var2.F.d();
                    x5 x5Var = y2Var2.r;
                    u2 u2Var = new u2(y2Var2, 0);
                    s5 s5Var = x5Var.y;
                    if (s5Var == null) {
                        u2Var.run();
                        break;
                    } else if (s5Var.b == null) {
                        s5Var.d = u2Var;
                        break;
                    } else {
                        u2Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
