package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p61 b;

    public /* synthetic */ m61(p61 p61Var, int i7) {
        this.a = i7;
        this.b = p61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p61 p61Var = this.b;
                p61Var.h = 0.0f;
                b6 b6Var = p61Var.b;
                if (b6Var != null) {
                    b6Var.u();
                    p61Var.b = null;
                    break;
                }
                break;
            case 1:
                p61 p61Var2 = this.b;
                p61Var2.a = true;
                p61Var2.e = null;
                if (p61Var2.b != null) {
                    p61Var2.s = true;
                    PhotoViewer photoViewer = p61Var2.N.a;
                    if (photoViewer.u3) {
                        photoViewer.a3(true);
                        break;
                    }
                }
                break;
            default:
                p61 p61Var3 = this.b;
                p61Var3.a = true;
                p61Var3.e = null;
                if (p61Var3.b != null) {
                    p61Var3.s = true;
                    PhotoViewer photoViewer2 = p61Var3.N.a;
                    if (photoViewer2.u3) {
                        photoViewer2.a3(true);
                        break;
                    }
                }
                break;
        }
    }
}
