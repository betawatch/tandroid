package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                t5 t5Var = a61Var.b;
                if (t5Var != null) {
                    t5Var.u();
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
                    PhotoViewer photoViewer = a61Var2.N.a;
                    if (photoViewer.u3) {
                        photoViewer.Z2(true);
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
                    PhotoViewer photoViewer2 = a61Var3.N.a;
                    if (photoViewer2.u3) {
                        photoViewer2.Z2(true);
                        break;
                    }
                }
                break;
        }
    }
}
