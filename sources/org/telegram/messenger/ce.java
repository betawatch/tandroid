package org.telegram.messenger;

import org.telegram.ui.Components.f60;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ce implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ cs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ce(cs csVar, Object obj, float f10, int i3) {
        this.a = i3;
        this.c = csVar;
        this.d = obj;
        this.b = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MediaController mediaController = (MediaController) this.c;
                zi ziVar = (zi) this.d;
                if (mediaController.j0 != null && mediaController.v0 != null && !mediaController.h0) {
                    if (mediaController.L(ziVar)) {
                        mediaController.i0(mediaController.v0, this.b);
                    }
                    mediaController.j0.h0();
                    break;
                }
                break;
            default:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.c;
                f60 f60Var = (f60) this.d;
                i4Var.i0.N.c(true, 0.0f);
                f60Var.p = new org.telegram.ui.c0(i4Var, this.b, 0);
                f60Var.Z();
                break;
        }
    }
}
