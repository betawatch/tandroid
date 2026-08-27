package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t61 b;

    public /* synthetic */ p61(t61 t61Var, int i10) {
        this.a = i10;
        this.b = t61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t61 t61Var = this.b;
                t61Var.h = 0.0f;
                x5 x5Var = t61Var.b;
                if (x5Var != null) {
                    x5Var.u();
                    t61Var.b = null;
                    break;
                }
                break;
            case 1:
                t61 t61Var2 = this.b;
                t61Var2.a = true;
                t61Var2.e = null;
                if (t61Var2.b != null) {
                    t61Var2.s = true;
                    PhotoViewer photoViewer = t61Var2.I.a;
                    if (photoViewer.q3) {
                        photoViewer.b3(true);
                        break;
                    }
                }
                break;
            default:
                t61 t61Var3 = this.b;
                t61Var3.a = true;
                t61Var3.e = null;
                if (t61Var3.b != null) {
                    t61Var3.s = true;
                    PhotoViewer photoViewer2 = t61Var3.I.a;
                    if (photoViewer2.q3) {
                        photoViewer2.b3(true);
                        break;
                    }
                }
                break;
        }
    }
}
