package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class e81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i81 b;

    public /* synthetic */ e81(i81 i81Var, int i10) {
        this.a = i10;
        this.b = i81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i81 i81Var = this.b;
                i81Var.h = 0.0f;
                e6 e6Var = i81Var.b;
                if (e6Var != null) {
                    e6Var.u();
                    i81Var.b = null;
                    break;
                }
                break;
            case 1:
                i81 i81Var2 = this.b;
                i81Var2.a = true;
                i81Var2.e = null;
                if (i81Var2.b != null) {
                    i81Var2.s = true;
                    PhotoViewer photoViewer = i81Var2.M.a;
                    if (photoViewer.u3) {
                        photoViewer.b3(true);
                        break;
                    }
                }
                break;
            default:
                i81 i81Var3 = this.b;
                i81Var3.a = true;
                i81Var3.e = null;
                if (i81Var3.b != null) {
                    i81Var3.s = true;
                    PhotoViewer photoViewer2 = i81Var3.M.a;
                    if (photoViewer2.u3) {
                        photoViewer2.b3(true);
                        break;
                    }
                }
                break;
        }
    }
}
