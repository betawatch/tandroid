package org.telegram.messenger;

import org.telegram.ui.Components.a70;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class fe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ gs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fe(gs gsVar, Object obj, float f10, int i7) {
        this.a = i7;
        this.c = gsVar;
        this.d = obj;
        this.b = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MediaController mediaController = (MediaController) this.c;
                gj gjVar = (gj) this.d;
                if (mediaController.j0 != null && mediaController.v0 != null && !mediaController.h0) {
                    if (mediaController.L(gjVar)) {
                        mediaController.i0(mediaController.v0, this.b);
                    }
                    mediaController.j0.h0();
                    break;
                }
                break;
            default:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.c;
                a70 a70Var = (a70) this.d;
                g4Var.i0.N.c(true, 0.0f);
                a70Var.p = new org.telegram.ui.a0(g4Var, this.b, 0);
                a70Var.a0();
                break;
        }
    }
}
