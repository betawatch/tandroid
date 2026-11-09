package org.telegram.messenger;

import org.telegram.ui.Components.l60;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class ie implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ ls c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ie(ls lsVar, Object obj, float f10, int i7) {
        this.a = i7;
        this.c = lsVar;
        this.d = obj;
        this.b = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MediaController mediaController = (MediaController) this.c;
                ij ijVar = (ij) this.d;
                if (mediaController.i0 != null && mediaController.u0 != null && !mediaController.g0) {
                    if (mediaController.L(ijVar)) {
                        mediaController.i0(mediaController.u0, this.b);
                    }
                    mediaController.i0.h0();
                    break;
                }
                break;
            default:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.c;
                l60 l60Var = (l60) this.d;
                g4Var.h0.M.c(true, 0.0f);
                l60Var.p = new org.telegram.ui.b0(g4Var, this.b, 0);
                l60Var.Z();
                break;
        }
    }
}
