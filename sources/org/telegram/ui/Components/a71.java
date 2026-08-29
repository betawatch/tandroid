package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d71 b;

    public /* synthetic */ a71(d71 d71Var, int i10) {
        this.a = i10;
        this.b = d71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d71 d71Var = this.b;
                d71Var.h = 0.0f;
                c6 c6Var = d71Var.b;
                if (c6Var != null) {
                    c6Var.u();
                    d71Var.b = null;
                    break;
                }
                break;
            case 1:
                d71 d71Var2 = this.b;
                d71Var2.a = true;
                d71Var2.e = null;
                if (d71Var2.b != null) {
                    d71Var2.s = true;
                    PhotoViewer photoViewer = d71Var2.I.a;
                    if (photoViewer.q3) {
                        photoViewer.b3(true);
                        break;
                    }
                }
                break;
            default:
                d71 d71Var3 = this.b;
                d71Var3.a = true;
                d71Var3.e = null;
                if (d71Var3.b != null) {
                    d71Var3.s = true;
                    PhotoViewer photoViewer2 = d71Var3.I.a;
                    if (photoViewer2.q3) {
                        photoViewer2.b3(true);
                        break;
                    }
                }
                break;
        }
    }
}
