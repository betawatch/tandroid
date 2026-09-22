package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ if0 b;

    public /* synthetic */ hf0(if0 if0Var, int i10) {
        this.a = i10;
        this.b = if0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if0 if0Var = this.b;
                jf0 jf0Var = if0Var.d;
                if (if0Var.b) {
                    boolean z10 = jf0Var.K;
                    org.telegram.ui.Components.kj0 kj0Var = jf0Var.J;
                    jd jdVar = jf0Var.n;
                    if (z10 && System.currentTimeMillis() - if0Var.a >= 10000) {
                        jdVar.setAnimation(kj0Var);
                        kj0Var.N(0, false, false);
                        kj0Var.t0 = new hf0(if0Var, 1);
                        jdVar.d();
                        if0Var.a = System.currentTimeMillis();
                    }
                    jdVar.postDelayed(if0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new hf0(this.b, 2));
                break;
            default:
                jf0 jf0Var2 = this.b.d;
                org.telegram.ui.Components.kj0 kj0Var2 = jf0Var2.I;
                kj0Var2.N(0, false, false);
                jf0Var2.n.setAnimation(kj0Var2);
                break;
        }
    }
}
