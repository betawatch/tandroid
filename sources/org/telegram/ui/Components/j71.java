package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n71 b;

    public /* synthetic */ j71(n71 n71Var, int i10) {
        this.a = i10;
        this.b = n71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n71 n71Var = this.b;
                n71Var.h = 0.0f;
                d6 d6Var = n71Var.b;
                if (d6Var != null) {
                    d6Var.u();
                    n71Var.b = null;
                    break;
                }
                break;
            case 1:
                n71 n71Var2 = this.b;
                n71Var2.a = true;
                n71Var2.e = null;
                if (n71Var2.b != null) {
                    n71Var2.s = true;
                    PhotoViewer photoViewer = n71Var2.M.a;
                    if (photoViewer.u3) {
                        photoViewer.b3(true);
                        break;
                    }
                }
                break;
            default:
                n71 n71Var3 = this.b;
                n71Var3.a = true;
                n71Var3.e = null;
                if (n71Var3.b != null) {
                    n71Var3.s = true;
                    PhotoViewer photoViewer2 = n71Var3.M.a;
                    if (photoViewer2.u3) {
                        photoViewer2.b3(true);
                        break;
                    }
                }
                break;
        }
    }
}
