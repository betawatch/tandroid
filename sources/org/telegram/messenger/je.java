package org.telegram.messenger;

import org.telegram.ui.Components.z60;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class je implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ vs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ je(vs vsVar, Object obj, float f7, int i10) {
        this.a = i10;
        this.c = vsVar;
        this.d = obj;
        this.b = f7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MediaController mediaController = (MediaController) this.c;
                kj kjVar = (kj) this.d;
                if (mediaController.i0 != null && mediaController.u0 != null && !mediaController.g0) {
                    if (mediaController.L(kjVar)) {
                        mediaController.i0(mediaController.u0, this.b);
                    }
                    mediaController.i0.h0();
                    break;
                }
                break;
            default:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.c;
                z60 z60Var = (z60) this.d;
                h4Var.h0.M.c(true, 0.0f);
                z60Var.p = new org.telegram.ui.a0(h4Var, this.b, 0);
                z60Var.Z();
                break;
        }
    }
}
