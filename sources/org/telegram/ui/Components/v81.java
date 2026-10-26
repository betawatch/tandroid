package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z81 b;

    public /* synthetic */ v81(z81 z81Var, int i10) {
        this.a = i10;
        this.b = z81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z81 z81Var = this.b;
                z81Var.h = 0.0f;
                g6 g6Var = z81Var.b;
                if (g6Var != null) {
                    g6Var.u();
                    z81Var.b = null;
                    break;
                }
                break;
            case 1:
                z81 z81Var2 = this.b;
                z81Var2.a = true;
                z81Var2.e = null;
                if (z81Var2.b != null) {
                    z81Var2.s = true;
                    PhotoViewer photoViewer = z81Var2.M.a;
                    if (photoViewer.u3) {
                        photoViewer.d3(true);
                        break;
                    }
                }
                break;
            default:
                z81 z81Var3 = this.b;
                z81Var3.a = true;
                z81Var3.e = null;
                if (z81Var3.b != null) {
                    z81Var3.s = true;
                    PhotoViewer photoViewer2 = z81Var3.M.a;
                    if (photoViewer2.u3) {
                        photoViewer2.d3(true);
                        break;
                    }
                }
                break;
        }
    }
}
