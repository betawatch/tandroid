package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b71 b;

    public /* synthetic */ x61(b71 b71Var, int i10) {
        this.a = i10;
        this.b = b71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b71 b71Var = this.b;
                b71Var.h = 0.0f;
                s5 s5Var = b71Var.b;
                if (s5Var != null) {
                    s5Var.u();
                    b71Var.b = null;
                    break;
                }
                break;
            case 1:
                b71 b71Var2 = this.b;
                b71Var2.a = true;
                b71Var2.e = null;
                if (b71Var2.b != null) {
                    b71Var2.s = true;
                    PhotoViewer photoViewer = b71Var2.M.a;
                    if (photoViewer.u3) {
                        photoViewer.e3(true);
                        break;
                    }
                }
                break;
            default:
                b71 b71Var3 = this.b;
                b71Var3.a = true;
                b71Var3.e = null;
                if (b71Var3.b != null) {
                    b71Var3.s = true;
                    PhotoViewer photoViewer2 = b71Var3.M.a;
                    if (photoViewer2.u3) {
                        photoViewer2.e3(true);
                        break;
                    }
                }
                break;
        }
    }
}
