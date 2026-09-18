package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o71 b;

    public /* synthetic */ k71(o71 o71Var, int i10) {
        this.a = i10;
        this.b = o71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o71 o71Var = this.b;
                o71Var.h = 0.0f;
                b6 b6Var = o71Var.b;
                if (b6Var != null) {
                    b6Var.u();
                    o71Var.b = null;
                    break;
                }
                break;
            case 1:
                o71 o71Var2 = this.b;
                o71Var2.a = true;
                o71Var2.e = null;
                if (o71Var2.b != null) {
                    o71Var2.s = true;
                    PhotoViewer photoViewer = o71Var2.M.a;
                    if (photoViewer.u3) {
                        photoViewer.a3(true);
                        break;
                    }
                }
                break;
            default:
                o71 o71Var3 = this.b;
                o71Var3.a = true;
                o71Var3.e = null;
                if (o71Var3.b != null) {
                    o71Var3.s = true;
                    PhotoViewer photoViewer2 = o71Var3.M.a;
                    if (photoViewer2.u3) {
                        photoViewer2.a3(true);
                        break;
                    }
                }
                break;
        }
    }
}
