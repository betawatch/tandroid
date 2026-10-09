package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ff0 b;

    public /* synthetic */ ef0(ff0 ff0Var, int i10) {
        this.a = i10;
        this.b = ff0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ff0 ff0Var = this.b;
                gf0 gf0Var = ff0Var.d;
                if (ff0Var.b) {
                    boolean z10 = gf0Var.K;
                    org.telegram.ui.Components.ck0 ck0Var = gf0Var.J;
                    jd jdVar = gf0Var.n;
                    if (z10 && System.currentTimeMillis() - ff0Var.a >= 10000) {
                        jdVar.setAnimation(ck0Var);
                        ck0Var.N(0, false, false);
                        ck0Var.t0 = new ef0(ff0Var, 1);
                        jdVar.d();
                        ff0Var.a = System.currentTimeMillis();
                    }
                    jdVar.postDelayed(ff0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ef0(this.b, 2));
                break;
            default:
                gf0 gf0Var2 = this.b.d;
                org.telegram.ui.Components.ck0 ck0Var2 = gf0Var2.I;
                ck0Var2.N(0, false, false);
                gf0Var2.n.setAnimation(ck0Var2);
                break;
        }
    }
}
