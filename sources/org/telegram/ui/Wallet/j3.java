package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class j3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3 b;

    public /* synthetic */ j3(n3 n3Var, int i7) {
        this.a = i7;
        this.b = n3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n3 n3Var = this.b;
                if (!n3Var.S && !n3Var.R) {
                    n3Var.a(1.0f);
                    break;
                }
                break;
            default:
                n3 n3Var2 = this.b;
                if (!n3Var2.S && !n3Var2.R) {
                    ih.d.c(n3Var2.E, n3Var2.h);
                    n3Var2.F.d();
                    f6 f6Var = n3Var2.r;
                    j3 j3Var = new j3(n3Var2, 0);
                    a6 a6Var = f6Var.D;
                    if (a6Var == null) {
                        j3Var.run();
                        break;
                    } else if (a6Var.b == null) {
                        a6Var.d = j3Var;
                        break;
                    } else {
                        j3Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
