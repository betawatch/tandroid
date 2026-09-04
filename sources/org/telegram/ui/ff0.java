package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ff0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gf0 b;

    public /* synthetic */ ff0(gf0 gf0Var, int i10) {
        this.a = i10;
        this.b = gf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gf0 gf0Var = this.b;
                hf0 hf0Var = gf0Var.d;
                if (gf0Var.b) {
                    boolean z10 = hf0Var.K;
                    org.telegram.ui.Components.xi0 xi0Var = hf0Var.J;
                    jd jdVar = hf0Var.n;
                    if (z10 && System.currentTimeMillis() - gf0Var.a >= 10000) {
                        jdVar.setAnimation(xi0Var);
                        xi0Var.L(0, false, false);
                        xi0Var.u0 = new ff0(gf0Var, 1);
                        jdVar.d();
                        gf0Var.a = System.currentTimeMillis();
                    }
                    jdVar.postDelayed(gf0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ff0(this.b, 2));
                break;
            default:
                hf0 hf0Var2 = this.b.d;
                org.telegram.ui.Components.xi0 xi0Var2 = hf0Var2.I;
                xi0Var2.L(0, false, false);
                hf0Var2.n.setAnimation(xi0Var2);
                break;
        }
    }
}
