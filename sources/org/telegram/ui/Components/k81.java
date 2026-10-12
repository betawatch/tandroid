package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class k81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p81 b;

    public /* synthetic */ k81(p81 p81Var, int i10) {
        this.a = i10;
        this.b = p81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p81 p81Var = this.b;
                p81Var.h = 0.0f;
                f6 f6Var = p81Var.b;
                if (f6Var != null) {
                    f6Var.u();
                    p81Var.b = null;
                    break;
                }
                break;
            case 1:
                p81 p81Var2 = this.b;
                p81Var2.a = true;
                p81Var2.e = null;
                if (p81Var2.b != null) {
                    p81Var2.s = true;
                    PhotoViewer photoViewer = p81Var2.M.a;
                    if (photoViewer.u3) {
                        photoViewer.b3(true);
                        break;
                    }
                }
                break;
            default:
                p81 p81Var3 = this.b;
                p81Var3.a = true;
                p81Var3.e = null;
                if (p81Var3.b != null) {
                    p81Var3.s = true;
                    PhotoViewer photoViewer2 = p81Var3.M.a;
                    if (photoViewer2.u3) {
                        photoViewer2.b3(true);
                        break;
                    }
                }
                break;
        }
    }
}
