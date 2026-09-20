package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                    org.telegram.ui.Components.hj0 hj0Var = jf0Var.J;
                    jd jdVar = jf0Var.n;
                    if (z10 && System.currentTimeMillis() - if0Var.a >= 10000) {
                        jdVar.setAnimation(hj0Var);
                        hj0Var.N(0, false, false);
                        hj0Var.t0 = new hf0(if0Var, 1);
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
                org.telegram.ui.Components.hj0 hj0Var2 = jf0Var2.I;
                hj0Var2.N(0, false, false);
                jf0Var2.n.setAnimation(hj0Var2);
                break;
        }
    }
}
