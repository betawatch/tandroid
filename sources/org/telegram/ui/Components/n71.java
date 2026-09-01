package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r71 b;

    public /* synthetic */ n71(r71 r71Var, int i10) {
        this.a = i10;
        this.b = r71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r71 r71Var = this.b;
                r71Var.h = 0.0f;
                y5 y5Var = r71Var.b;
                if (y5Var != null) {
                    y5Var.u();
                    r71Var.b = null;
                    break;
                }
                break;
            case 1:
                r71 r71Var2 = this.b;
                r71Var2.a = true;
                r71Var2.e = null;
                if (r71Var2.b != null) {
                    r71Var2.s = true;
                    PhotoViewer photoViewer = r71Var2.J.a;
                    if (photoViewer.r3) {
                        photoViewer.b3(true);
                        break;
                    }
                }
                break;
            default:
                r71 r71Var3 = this.b;
                r71Var3.a = true;
                r71Var3.e = null;
                if (r71Var3.b != null) {
                    r71Var3.s = true;
                    PhotoViewer photoViewer2 = r71Var3.J.a;
                    if (photoViewer2.r3) {
                        photoViewer2.b3(true);
                        break;
                    }
                }
                break;
        }
    }
}
