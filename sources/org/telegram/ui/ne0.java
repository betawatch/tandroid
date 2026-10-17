package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oe0 b;

    public /* synthetic */ ne0(oe0 oe0Var, int i10) {
        this.a = i10;
        this.b = oe0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oe0 oe0Var = this.b;
                pe0 pe0Var = oe0Var.d;
                if (oe0Var.b) {
                    boolean z10 = pe0Var.K;
                    org.telegram.ui.Components.uj0 uj0Var = pe0Var.J;
                    ld ldVar = pe0Var.n;
                    if (z10 && System.currentTimeMillis() - oe0Var.a >= 10000) {
                        ldVar.setAnimation(uj0Var);
                        uj0Var.N(0, false, false);
                        uj0Var.t0 = new ne0(oe0Var, 1);
                        ldVar.d();
                        oe0Var.a = System.currentTimeMillis();
                    }
                    ldVar.postDelayed(oe0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ne0(this.b, 2));
                break;
            default:
                pe0 pe0Var2 = this.b.d;
                org.telegram.ui.Components.uj0 uj0Var2 = pe0Var2.I;
                uj0Var2.N(0, false, false);
                pe0Var2.n.setAnimation(uj0Var2);
                break;
        }
    }
}
