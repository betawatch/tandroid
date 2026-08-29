package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                    boolean z10 = pe0Var.G;
                    org.telegram.ui.Components.xi0 xi0Var = pe0Var.F;
                    ed edVar = pe0Var.n;
                    if (z10 && System.currentTimeMillis() - oe0Var.a >= 10000) {
                        edVar.setAnimation(xi0Var);
                        xi0Var.L(0, false, false);
                        xi0Var.q0 = new ne0(oe0Var, 1);
                        edVar.d();
                        oe0Var.a = System.currentTimeMillis();
                    }
                    edVar.postDelayed(oe0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ne0(this.b, 2));
                break;
            default:
                pe0 pe0Var2 = this.b.d;
                org.telegram.ui.Components.xi0 xi0Var2 = pe0Var2.E;
                xi0Var2.L(0, false, false);
                pe0Var2.n.setAnimation(xi0Var2);
                break;
        }
    }
}
