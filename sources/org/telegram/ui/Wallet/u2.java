package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z2 b;

    public /* synthetic */ u2(z2 z2Var, int i10) {
        this.a = i10;
        this.b = z2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z2 z2Var = this.b;
                if (!z2Var.Q && !z2Var.P) {
                    z2Var.a(1.0f);
                    break;
                }
                break;
            default:
                z2 z2Var2 = this.b;
                if (!z2Var2.Q && !z2Var2.P) {
                    hh.d.c(z2Var2.E, z2Var2.h);
                    z2Var2.F.d();
                    x5 x5Var = z2Var2.r;
                    u2 u2Var = new u2(z2Var2, 0);
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
