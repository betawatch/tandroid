package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s51 b;

    public /* synthetic */ p51(s51 s51Var, int i3) {
        this.a = i3;
        this.b = s51Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s51 s51Var = this.b;
                s51Var.h = 0.0f;
                t5 t5Var = s51Var.b;
                if (t5Var != null) {
                    t5Var.u();
                    s51Var.b = null;
                    break;
                }
                break;
            case 1:
                s51 s51Var2 = this.b;
                s51Var2.a = true;
                s51Var2.e = null;
                if (s51Var2.b != null) {
                    s51Var2.s = true;
                    PhotoViewer photoViewer = s51Var2.N.a;
                    if (photoViewer.v3) {
                        photoViewer.e3(true);
                        break;
                    }
                }
                break;
            default:
                s51 s51Var3 = this.b;
                s51Var3.a = true;
                s51Var3.e = null;
                if (s51Var3.b != null) {
                    s51Var3.s = true;
                    PhotoViewer photoViewer2 = s51Var3.N.a;
                    if (photoViewer2.v3) {
                        photoViewer2.e3(true);
                        break;
                    }
                }
                break;
        }
    }
}
