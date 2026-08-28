package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oe0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pe0 b;

    public /* synthetic */ oe0(pe0 pe0Var, int i9) {
        this.a = i9;
        this.b = pe0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pe0 pe0Var = this.b;
                qe0 qe0Var = pe0Var.d;
                if (pe0Var.b) {
                    boolean z10 = qe0Var.G;
                    org.telegram.ui.Components.mi0 mi0Var = qe0Var.F;
                    fd fdVar = qe0Var.n;
                    if (z10 && System.currentTimeMillis() - pe0Var.a >= 10000) {
                        fdVar.setAnimation(mi0Var);
                        mi0Var.L(0, false, false);
                        mi0Var.q0 = new oe0(pe0Var, 1);
                        fdVar.d();
                        pe0Var.a = System.currentTimeMillis();
                    }
                    fdVar.postDelayed(pe0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new oe0(this.b, 2));
                break;
            default:
                qe0 qe0Var2 = this.b.d;
                org.telegram.ui.Components.mi0 mi0Var2 = qe0Var2.E;
                mi0Var2.L(0, false, false);
                qe0Var2.n.setAnimation(mi0Var2);
                break;
        }
    }
}
