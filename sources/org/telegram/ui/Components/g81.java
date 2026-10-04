package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class g81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k81 b;

    public /* synthetic */ g81(k81 k81Var, int i10) {
        this.a = i10;
        this.b = k81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k81 k81Var = this.b;
                k81Var.h = 0.0f;
                d6 d6Var = k81Var.b;
                if (d6Var != null) {
                    d6Var.u();
                    k81Var.b = null;
                    break;
                }
                break;
            case 1:
                k81 k81Var2 = this.b;
                k81Var2.a = true;
                k81Var2.e = null;
                if (k81Var2.b != null) {
                    k81Var2.s = true;
                    PhotoViewer photoViewer = k81Var2.M.a;
                    if (photoViewer.u3) {
                        photoViewer.b3(true);
                        break;
                    }
                }
                break;
            default:
                k81 k81Var3 = this.b;
                k81Var3.a = true;
                k81Var3.e = null;
                if (k81Var3.b != null) {
                    k81Var3.s = true;
                    PhotoViewer photoViewer2 = k81Var3.M.a;
                    if (photoViewer2.u3) {
                        photoViewer2.b3(true);
                        break;
                    }
                }
                break;
        }
    }
}
