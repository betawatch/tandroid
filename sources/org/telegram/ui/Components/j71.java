package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                b6 b6Var = n71Var.b;
                if (b6Var != null) {
                    b6Var.u();
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
                        photoViewer.a3(true);
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
                        photoViewer2.a3(true);
                        break;
                    }
                }
                break;
        }
    }
}
