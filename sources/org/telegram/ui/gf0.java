package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hf0 b;

    public /* synthetic */ gf0(hf0 hf0Var, int i10) {
        this.a = i10;
        this.b = hf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hf0 hf0Var = this.b;
                if0 if0Var = hf0Var.d;
                if (hf0Var.b) {
                    boolean z10 = if0Var.K;
                    org.telegram.ui.Components.ij0 ij0Var = if0Var.J;
                    jd jdVar = if0Var.n;
                    if (z10 && System.currentTimeMillis() - hf0Var.a >= 10000) {
                        jdVar.setAnimation(ij0Var);
                        ij0Var.N(0, false, false);
                        ij0Var.t0 = new gf0(hf0Var, 1);
                        jdVar.d();
                        hf0Var.a = System.currentTimeMillis();
                    }
                    jdVar.postDelayed(hf0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new gf0(this.b, 2));
                break;
            default:
                if0 if0Var2 = this.b.d;
                org.telegram.ui.Components.ij0 ij0Var2 = if0Var2.I;
                ij0Var2.N(0, false, false);
                if0Var2.n.setAnimation(ij0Var2);
                break;
        }
    }
}
