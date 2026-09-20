package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class w71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b81 b;

    public /* synthetic */ w71(b81 b81Var, int i10) {
        this.a = i10;
        this.b = b81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b81 b81Var = this.b;
                b81Var.h = 0.0f;
                c6 c6Var = b81Var.b;
                if (c6Var != null) {
                    c6Var.u();
                    b81Var.b = null;
                    break;
                }
                break;
            case 1:
                b81 b81Var2 = this.b;
                b81Var2.a = true;
                b81Var2.e = null;
                if (b81Var2.b != null) {
                    b81Var2.s = true;
                    PhotoViewer photoViewer = b81Var2.M.a;
                    if (photoViewer.u3) {
                        photoViewer.a3(true);
                        break;
                    }
                }
                break;
            default:
                b81 b81Var3 = this.b;
                b81Var3.a = true;
                b81Var3.e = null;
                if (b81Var3.b != null) {
                    b81Var3.s = true;
                    PhotoViewer photoViewer2 = b81Var3.M.a;
                    if (photoViewer2.u3) {
                        photoViewer2.a3(true);
                        break;
                    }
                }
                break;
        }
    }
}
