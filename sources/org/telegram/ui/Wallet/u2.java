package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                    ih.d.c(y2Var2.E, y2Var2.h);
                    y2Var2.F.d();
                    w5 w5Var = y2Var2.r;
                    u2 u2Var = new u2(y2Var2, 0);
                    r5 r5Var = w5Var.y;
                    if (r5Var == null) {
                        u2Var.run();
                        break;
                    } else if (r5Var.b == null) {
                        r5Var.d = u2Var;
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
