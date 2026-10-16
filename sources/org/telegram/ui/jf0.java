package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kf0 b;

    public /* synthetic */ jf0(kf0 kf0Var, int i10) {
        this.a = i10;
        this.b = kf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kf0 kf0Var = this.b;
                lf0 lf0Var = kf0Var.d;
                if (kf0Var.b) {
                    boolean z10 = lf0Var.K;
                    org.telegram.ui.Components.yj0 yj0Var = lf0Var.J;
                    pd pdVar = lf0Var.n;
                    if (z10 && System.currentTimeMillis() - kf0Var.a >= 10000) {
                        pdVar.setAnimation(yj0Var);
                        yj0Var.N(0, false, false);
                        yj0Var.t0 = new jf0(kf0Var, 1);
                        pdVar.d();
                        kf0Var.a = System.currentTimeMillis();
                    }
                    pdVar.postDelayed(kf0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new jf0(this.b, 2));
                break;
            default:
                lf0 lf0Var2 = this.b.d;
                org.telegram.ui.Components.yj0 yj0Var2 = lf0Var2.I;
                yj0Var2.N(0, false, false);
                lf0Var2.n.setAnimation(yj0Var2);
                break;
        }
    }
}
