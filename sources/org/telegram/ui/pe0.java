package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qe0 b;

    public /* synthetic */ pe0(qe0 qe0Var, int i10) {
        this.a = i10;
        this.b = qe0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qe0 qe0Var = this.b;
                re0 re0Var = qe0Var.d;
                if (qe0Var.b) {
                    boolean z10 = re0Var.K;
                    org.telegram.ui.Components.xj0 xj0Var = re0Var.J;
                    kd kdVar = re0Var.n;
                    if (z10 && System.currentTimeMillis() - qe0Var.a >= 10000) {
                        kdVar.setAnimation(xj0Var);
                        xj0Var.N(0, false, false);
                        xj0Var.t0 = new pe0(qe0Var, 1);
                        kdVar.d();
                        qe0Var.a = System.currentTimeMillis();
                    }
                    kdVar.postDelayed(qe0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new pe0(this.b, 2));
                break;
            default:
                re0 re0Var2 = this.b.d;
                org.telegram.ui.Components.xj0 xj0Var2 = re0Var2.I;
                xj0Var2.N(0, false, false);
                re0Var2.n.setAnimation(xj0Var2);
                break;
        }
    }
}
