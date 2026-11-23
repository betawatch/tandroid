package org.telegram.messenger;

import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class ee implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ fs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ee(fs fsVar, Object obj, float f10, int i7) {
        this.a = i7;
        this.c = fsVar;
        this.d = obj;
        this.b = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MediaController mediaController = (MediaController) this.c;
                fj fjVar = (fj) this.d;
                if (mediaController.j0 != null && mediaController.v0 != null && !mediaController.h0) {
                    if (mediaController.L(fjVar)) {
                        mediaController.i0(mediaController.v0, this.b);
                    }
                    mediaController.j0.h0();
                    break;
                }
                break;
            default:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.c;
                x60 x60Var = (x60) this.d;
                g4Var.i0.N.c(true, 0.0f);
                x60Var.p = new org.telegram.ui.a0(g4Var, this.b, 0);
                x60Var.a0();
                break;
        }
    }
}
