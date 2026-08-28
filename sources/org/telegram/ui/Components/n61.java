package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r61 b;

    public /* synthetic */ n61(r61 r61Var, int i9) {
        this.a = i9;
        this.b = r61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r61 r61Var = this.b;
                r61Var.h = 0.0f;
                x5 x5Var = r61Var.b;
                if (x5Var != null) {
                    x5Var.u();
                    r61Var.b = null;
                    break;
                }
                break;
            case 1:
                r61 r61Var2 = this.b;
                r61Var2.a = true;
                r61Var2.e = null;
                if (r61Var2.b != null) {
                    r61Var2.s = true;
                    PhotoViewer photoViewer = r61Var2.I.a;
                    if (photoViewer.q3) {
                        photoViewer.b3(true);
                        break;
                    }
                }
                break;
            default:
                r61 r61Var3 = this.b;
                r61Var3.a = true;
                r61Var3.e = null;
                if (r61Var3.b != null) {
                    r61Var3.s = true;
                    PhotoViewer photoViewer2 = r61Var3.I.a;
                    if (photoViewer2.q3) {
                        photoViewer2.b3(true);
                        break;
                    }
                }
                break;
        }
    }
}
