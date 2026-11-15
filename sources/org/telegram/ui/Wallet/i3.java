package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class i3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3 b;

    public /* synthetic */ i3(o3 o3Var, int i7) {
        this.a = i7;
        this.b = o3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o3 o3Var = this.b;
                if (!o3Var.T && !o3Var.S) {
                    ih.d.c(o3Var.F, o3Var.h);
                    o3Var.G.d();
                    h6 h6Var = o3Var.r;
                    i3 i3Var = new i3(o3Var, 1);
                    c6 c6Var = h6Var.E;
                    if (c6Var == null) {
                        i3Var.run();
                        break;
                    } else if (c6Var.b == null) {
                        c6Var.d = i3Var;
                        break;
                    } else {
                        i3Var.run();
                        break;
                    }
                }
                break;
            default:
                o3 o3Var2 = this.b;
                if (!o3Var2.T && !o3Var2.S) {
                    o3Var2.a(1.0f);
                    break;
                }
                break;
        }
    }
}
