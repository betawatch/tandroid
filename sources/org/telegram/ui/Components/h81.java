package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l81 b;

    public /* synthetic */ h81(l81 l81Var, int i10) {
        this.a = i10;
        this.b = l81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l81 l81Var = this.b;
                l81Var.h = 0.0f;
                d6 d6Var = l81Var.b;
                if (d6Var != null) {
                    d6Var.u();
                    l81Var.b = null;
                    break;
                }
                break;
            case 1:
                l81 l81Var2 = this.b;
                l81Var2.a = true;
                l81Var2.e = null;
                if (l81Var2.b != null) {
                    l81Var2.s = true;
                    PhotoViewer photoViewer = l81Var2.M.a;
                    if (photoViewer.u3) {
                        photoViewer.b3(true);
                        break;
                    }
                }
                break;
            default:
                l81 l81Var3 = this.b;
                l81Var3.a = true;
                l81Var3.e = null;
                if (l81Var3.b != null) {
                    l81Var3.s = true;
                    PhotoViewer photoViewer2 = l81Var3.M.a;
                    if (photoViewer2.u3) {
                        photoViewer2.b3(true);
                        break;
                    }
                }
                break;
        }
    }
}
