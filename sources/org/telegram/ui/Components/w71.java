package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class w71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a81 b;

    public /* synthetic */ w71(a81 a81Var, int i10) {
        this.a = i10;
        this.b = a81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a81 a81Var = this.b;
                a81Var.h = 0.0f;
                c6 c6Var = a81Var.b;
                if (c6Var != null) {
                    c6Var.u();
                    a81Var.b = null;
                    break;
                }
                break;
            case 1:
                a81 a81Var2 = this.b;
                a81Var2.a = true;
                a81Var2.e = null;
                if (a81Var2.b != null) {
                    a81Var2.s = true;
                    PhotoViewer photoViewer = a81Var2.M.a;
                    if (photoViewer.u3) {
                        photoViewer.b3(true);
                        break;
                    }
                }
                break;
            default:
                a81 a81Var3 = this.b;
                a81Var3.a = true;
                a81Var3.e = null;
                if (a81Var3.b != null) {
                    a81Var3.s = true;
                    PhotoViewer photoViewer2 = a81Var3.M.a;
                    if (photoViewer2.u3) {
                        photoViewer2.b3(true);
                        break;
                    }
                }
                break;
        }
    }
}
