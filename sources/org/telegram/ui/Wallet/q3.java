package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class q3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;

    public /* synthetic */ q3(w3 w3Var, int i7) {
        this.a = i7;
        this.b = w3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w3 w3Var = this.b;
                if (!w3Var.T && !w3Var.S) {
                    ih.d.c(w3Var.F, w3Var.h);
                    w3Var.G.d();
                    x6 x6Var = w3Var.r;
                    q3 q3Var = new q3(w3Var, 1);
                    s6 s6Var = x6Var.E;
                    if (s6Var == null) {
                        q3Var.run();
                        break;
                    } else if (s6Var.b == null) {
                        s6Var.d = q3Var;
                        break;
                    } else {
                        q3Var.run();
                        break;
                    }
                }
                break;
            default:
                w3 w3Var2 = this.b;
                if (!w3Var2.T && !w3Var2.S) {
                    w3Var2.a(1.0f);
                    break;
                }
                break;
        }
    }
}
