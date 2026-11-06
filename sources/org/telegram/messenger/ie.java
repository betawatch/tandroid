package org.telegram.messenger;

import org.telegram.ui.Components.k60;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                k60 k60Var = (k60) this.d;
                g4Var.h0.M.c(true, 0.0f);
                k60Var.p = new org.telegram.ui.b0(g4Var, this.b, 0);
                k60Var.Z();
                break;
        }
    }
}
