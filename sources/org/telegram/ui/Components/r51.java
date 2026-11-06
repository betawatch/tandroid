package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u51 b;

    public /* synthetic */ r51(u51 u51Var, int i7) {
        this.a = i7;
        this.b = u51Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u51 u51Var = this.b;
                u51Var.h = 0.0f;
                v5 v5Var = u51Var.b;
                if (v5Var != null) {
                    v5Var.u();
                    u51Var.b = null;
                    break;
                }
                break;
            case 1:
                u51 u51Var2 = this.b;
                u51Var2.a = true;
                u51Var2.e = null;
                if (u51Var2.b != null) {
                    u51Var2.s = true;
                    PhotoViewer photoViewer = u51Var2.M.a;
                    if (photoViewer.t3) {
                        photoViewer.Y2(true);
                        break;
                    }
                }
                break;
            default:
                u51 u51Var3 = this.b;
                u51Var3.a = true;
                u51Var3.e = null;
                if (u51Var3.b != null) {
                    u51Var3.s = true;
                    PhotoViewer photoViewer2 = u51Var3.M.a;
                    if (photoViewer2.t3) {
                        photoViewer2.Y2(true);
                        break;
                    }
                }
                break;
        }
    }
}
