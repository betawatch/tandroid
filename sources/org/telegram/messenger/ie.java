package org.telegram.messenger;

import org.telegram.ui.Components.z60;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ie implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ us c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ie(us usVar, Object obj, float f7, int i10) {
        this.a = i10;
        this.c = usVar;
        this.d = obj;
        this.b = f7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MediaController mediaController = (MediaController) this.c;
                jj jjVar = (jj) this.d;
                if (mediaController.i0 != null && mediaController.u0 != null && !mediaController.g0) {
                    if (mediaController.L(jjVar)) {
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
