package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z2 b;

    public /* synthetic */ v2(z2 z2Var, int i10) {
        this.a = i10;
        this.b = z2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z2 z2Var = this.b;
                if (!z2Var.S && !z2Var.R) {
                    z2Var.a(1.0f);
                    break;
                }
                break;
            default:
                z2 z2Var2 = this.b;
                if (!z2Var2.S && !z2Var2.R) {
                    hh.d.c(z2Var2.E, z2Var2.h);
                    z2Var2.F.d();
                    x5 x5Var = z2Var2.r;
                    v2 v2Var = new v2(z2Var2, 0);
                    s5 s5Var = x5Var.y;
                    if (s5Var == null) {
                        v2Var.run();
                        break;
                    } else if (s5Var.b == null) {
                        s5Var.d = v2Var;
                        break;
                    } else {
                        v2Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
