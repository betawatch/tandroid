package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h81 b;

    public /* synthetic */ d81(h81 h81Var, int i10) {
        this.a = i10;
        this.b = h81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h81 h81Var = this.b;
                h81Var.h = 0.0f;
                e6 e6Var = h81Var.b;
                if (e6Var != null) {
                    e6Var.u();
                    h81Var.b = null;
                    break;
                }
                break;
            case 1:
                h81 h81Var2 = this.b;
                h81Var2.a = true;
                h81Var2.e = null;
                if (h81Var2.b != null) {
                    h81Var2.s = true;
                    PhotoViewer photoViewer = h81Var2.M.a;
                    if (photoViewer.u3) {
                        photoViewer.b3(true);
                        break;
                    }
                }
                break;
            default:
                h81 h81Var3 = this.b;
                h81Var3.a = true;
                h81Var3.e = null;
                if (h81Var3.b != null) {
                    h81Var3.s = true;
                    PhotoViewer photoViewer2 = h81Var3.M.a;
                    if (photoViewer2.u3) {
                        photoViewer2.b3(true);
                        break;
                    }
                }
                break;
        }
    }
}
