package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class y71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d81 b;

    public /* synthetic */ y71(d81 d81Var, int i10) {
        this.a = i10;
        this.b = d81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d81 d81Var = this.b;
                d81Var.h = 0.0f;
                c6 c6Var = d81Var.b;
                if (c6Var != null) {
                    c6Var.u();
                    d81Var.b = null;
                    break;
                }
                break;
            case 1:
                d81 d81Var2 = this.b;
                d81Var2.a = true;
                d81Var2.e = null;
                if (d81Var2.b != null) {
                    d81Var2.s = true;
                    PhotoViewer photoViewer = d81Var2.M.a;
                    if (photoViewer.u3) {
                        photoViewer.a3(true);
                        break;
                    }
                }
                break;
            default:
                d81 d81Var3 = this.b;
                d81Var3.a = true;
                d81Var3.e = null;
                if (d81Var3.b != null) {
                    d81Var3.s = true;
                    PhotoViewer photoViewer2 = d81Var3.M.a;
                    if (photoViewer2.u3) {
                        photoViewer2.a3(true);
                        break;
                    }
                }
                break;
        }
    }
}
