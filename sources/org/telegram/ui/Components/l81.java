package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q81 b;

    public /* synthetic */ l81(q81 q81Var, int i10) {
        this.a = i10;
        this.b = q81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q81 q81Var = this.b;
                q81Var.h = 0.0f;
                f6 f6Var = q81Var.b;
                if (f6Var != null) {
                    f6Var.u();
                    q81Var.b = null;
                    break;
                }
                break;
            case 1:
                q81 q81Var2 = this.b;
                q81Var2.a = true;
                q81Var2.e = null;
                if (q81Var2.b != null) {
                    q81Var2.s = true;
                    PhotoViewer photoViewer = q81Var2.M.a;
                    if (photoViewer.u3) {
                        photoViewer.b3(true);
                        break;
                    }
                }
                break;
            default:
                q81 q81Var3 = this.b;
                q81Var3.a = true;
                q81Var3.e = null;
                if (q81Var3.b != null) {
                    q81Var3.s = true;
                    PhotoViewer photoViewer2 = q81Var3.M.a;
                    if (photoViewer2.u3) {
                        photoViewer2.b3(true);
                        break;
                    }
                }
                break;
        }
    }
}
