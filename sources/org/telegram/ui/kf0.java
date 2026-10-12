package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lf0 b;

    public /* synthetic */ kf0(lf0 lf0Var, int i10) {
        this.a = i10;
        this.b = lf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lf0 lf0Var = this.b;
                mf0 mf0Var = lf0Var.d;
                if (lf0Var.b) {
                    boolean z10 = mf0Var.K;
                    org.telegram.ui.Components.yj0 yj0Var = mf0Var.J;
                    pd pdVar = mf0Var.n;
                    if (z10 && System.currentTimeMillis() - lf0Var.a >= 10000) {
                        pdVar.setAnimation(yj0Var);
                        yj0Var.N(0, false, false);
                        yj0Var.t0 = new kf0(lf0Var, 1);
                        pdVar.d();
                        lf0Var.a = System.currentTimeMillis();
                    }
                    pdVar.postDelayed(lf0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new kf0(this.b, 2));
                break;
            default:
                mf0 mf0Var2 = this.b.d;
                org.telegram.ui.Components.yj0 yj0Var2 = mf0Var2.I;
                yj0Var2.N(0, false, false);
                mf0Var2.n.setAnimation(yj0Var2);
                break;
        }
    }
}
