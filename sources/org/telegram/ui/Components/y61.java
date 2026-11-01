package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c71 b;

    public /* synthetic */ y61(c71 c71Var, int i10) {
        this.a = i10;
        this.b = c71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c71 c71Var = this.b;
                c71Var.h = 0.0f;
                s5 s5Var = c71Var.b;
                if (s5Var != null) {
                    s5Var.u();
                    c71Var.b = null;
                    break;
                }
                break;
            case 1:
                c71 c71Var2 = this.b;
                c71Var2.a = true;
                c71Var2.e = null;
                if (c71Var2.b != null) {
                    c71Var2.s = true;
                    PhotoViewer photoViewer = c71Var2.M.a;
                    if (photoViewer.u3) {
                        photoViewer.e3(true);
                        break;
                    }
                }
                break;
            default:
                c71 c71Var3 = this.b;
                c71Var3.a = true;
                c71Var3.e = null;
                if (c71Var3.b != null) {
                    c71Var3.s = true;
                    PhotoViewer photoViewer2 = c71Var3.M.a;
                    if (photoViewer2.u3) {
                        photoViewer2.e3(true);
                        break;
                    }
                }
                break;
        }
    }
}
