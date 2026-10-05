package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class df0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ef0 b;

    public /* synthetic */ df0(ef0 ef0Var, int i10) {
        this.a = i10;
        this.b = ef0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ef0 ef0Var = this.b;
                ff0 ff0Var = ef0Var.d;
                if (ef0Var.b) {
                    boolean z10 = ff0Var.K;
                    org.telegram.ui.Components.kj0 kj0Var = ff0Var.J;
                    kd kdVar = ff0Var.n;
                    if (z10 && System.currentTimeMillis() - ef0Var.a >= 10000) {
                        kdVar.setAnimation(kj0Var);
                        kj0Var.N(0, false, false);
                        kj0Var.t0 = new df0(ef0Var, 1);
                        kdVar.d();
                        ef0Var.a = System.currentTimeMillis();
                    }
                    kdVar.postDelayed(ef0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new df0(this.b, 2));
                break;
            default:
                ff0 ff0Var2 = this.b.d;
                org.telegram.ui.Components.kj0 kj0Var2 = ff0Var2.I;
                kj0Var2.N(0, false, false);
                ff0Var2.n.setAnimation(kj0Var2);
                break;
        }
    }
}
