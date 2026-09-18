package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b81 b;

    public /* synthetic */ x71(b81 b81Var, int i10) {
        this.a = i10;
        this.b = b81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b81 b81Var = this.b;
                b81Var.h = 0.0f;
                d6 d6Var = b81Var.b;
                if (d6Var != null) {
                    d6Var.u();
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
