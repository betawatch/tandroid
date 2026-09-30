package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c81 b;

    public /* synthetic */ x71(c81 c81Var, int i10) {
        this.a = i10;
        this.b = c81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c81 c81Var = this.b;
                c81Var.h = 0.0f;
                d6 d6Var = c81Var.b;
                if (d6Var != null) {
                    d6Var.u();
                    c81Var.b = null;
                    break;
                }
                break;
            case 1:
                c81 c81Var2 = this.b;
                c81Var2.a = true;
                c81Var2.e = null;
                if (c81Var2.b != null) {
                    c81Var2.s = true;
                    PhotoViewer photoViewer = c81Var2.M.a;
                    if (photoViewer.u3) {
                        photoViewer.b3(true);
                        break;
                    }
                }
                break;
            default:
                c81 c81Var3 = this.b;
                c81Var3.a = true;
                c81Var3.e = null;
                if (c81Var3.b != null) {
                    c81Var3.s = true;
                    PhotoViewer photoViewer2 = c81Var3.M.a;
                    if (photoViewer2.u3) {
                        photoViewer2.b3(true);
                        break;
                    }
                }
                break;
        }
    }
}
