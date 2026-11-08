package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z51 b;

    public /* synthetic */ w51(z51 z51Var, int i7) {
        this.a = i7;
        this.b = z51Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z51 z51Var = this.b;
                z51Var.h = 0.0f;
                v5 v5Var = z51Var.b;
                if (v5Var != null) {
                    v5Var.u();
                    z51Var.b = null;
                    break;
                }
                break;
            case 1:
                z51 z51Var2 = this.b;
                z51Var2.a = true;
                z51Var2.e = null;
                if (z51Var2.b != null) {
                    z51Var2.s = true;
                    PhotoViewer photoViewer = z51Var2.M.a;
                    if (photoViewer.t3) {
                        photoViewer.Y2(true);
                        break;
                    }
                }
                break;
            default:
                z51 z51Var3 = this.b;
                z51Var3.a = true;
                z51Var3.e = null;
                if (z51Var3.b != null) {
                    z51Var3.s = true;
                    PhotoViewer photoViewer2 = z51Var3.M.a;
                    if (photoViewer2.t3) {
                        photoViewer2.Y2(true);
                        break;
                    }
                }
                break;
        }
    }
}
