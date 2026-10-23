package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j81 b;

    public /* synthetic */ f81(j81 j81Var, int i10) {
        this.a = i10;
        this.b = j81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j81 j81Var = this.b;
                j81Var.h = 0.0f;
                e6 e6Var = j81Var.b;
                if (e6Var != null) {
                    e6Var.u();
                    j81Var.b = null;
                    break;
                }
                break;
            case 1:
                j81 j81Var2 = this.b;
                j81Var2.a = true;
                j81Var2.e = null;
                if (j81Var2.b != null) {
                    j81Var2.s = true;
                    PhotoViewer photoViewer = j81Var2.M.a;
                    if (photoViewer.u3) {
                        photoViewer.d3(true);
                        break;
                    }
                }
                break;
            default:
                j81 j81Var3 = this.b;
                j81Var3.a = true;
                j81Var3.e = null;
                if (j81Var3.b != null) {
                    j81Var3.s = true;
                    PhotoViewer photoViewer2 = j81Var3.M.a;
                    if (photoViewer2.u3) {
                        photoViewer2.d3(true);
                        break;
                    }
                }
                break;
        }
    }
}
