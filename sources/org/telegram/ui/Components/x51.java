package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a61 b;

    public /* synthetic */ x51(a61 a61Var, int i7) {
        this.a = i7;
        this.b = a61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a61 a61Var = this.b;
                a61Var.h = 0.0f;
                v5 v5Var = a61Var.b;
                if (v5Var != null) {
                    v5Var.u();
                    a61Var.b = null;
                    break;
                }
                break;
            case 1:
                a61 a61Var2 = this.b;
                a61Var2.a = true;
                a61Var2.e = null;
                if (a61Var2.b != null) {
                    a61Var2.s = true;
                    PhotoViewer photoViewer = a61Var2.M.a;
                    if (photoViewer.t3) {
                        photoViewer.Y2(true);
                        break;
                    }
                }
                break;
            default:
                a61 a61Var3 = this.b;
                a61Var3.a = true;
                a61Var3.e = null;
                if (a61Var3.b != null) {
                    a61Var3.s = true;
                    PhotoViewer photoViewer2 = a61Var3.M.a;
                    if (photoViewer2.t3) {
                        photoViewer2.Y2(true);
                        break;
                    }
                }
                break;
        }
    }
}
