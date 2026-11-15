package org.telegram.messenger;

import org.telegram.ui.Components.m60;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class fe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ is c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fe(is isVar, Object obj, float f10, int i7) {
        this.a = i7;
        this.c = isVar;
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
                m60 m60Var = (m60) this.d;
                g4Var.i0.N.c(true, 0.0f);
                m60Var.p = new org.telegram.ui.a0(g4Var, this.b, 0);
                m60Var.Z();
                break;
        }
    }
}
