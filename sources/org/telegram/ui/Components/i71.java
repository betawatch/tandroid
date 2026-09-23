package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class i71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m71 b;

    public /* synthetic */ i71(m71 m71Var, int i10) {
        this.a = i10;
        this.b = m71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m71 m71Var = this.b;
                m71Var.h = 0.0f;
                d6 d6Var = m71Var.b;
                if (d6Var != null) {
                    d6Var.u();
                    m71Var.b = null;
                    break;
                }
                break;
            case 1:
                m71 m71Var2 = this.b;
                m71Var2.a = true;
                m71Var2.e = null;
                if (m71Var2.b != null) {
                    m71Var2.s = true;
                    PhotoViewer photoViewer = m71Var2.M.a;
                    if (photoViewer.u3) {
                        photoViewer.a3(true);
                        break;
                    }
                }
                break;
            default:
                m71 m71Var3 = this.b;
                m71Var3.a = true;
                m71Var3.e = null;
                if (m71Var3.b != null) {
                    m71Var3.s = true;
                    PhotoViewer photoViewer2 = m71Var3.M.a;
                    if (photoViewer2.u3) {
                        photoViewer2.a3(true);
                        break;
                    }
                }
                break;
        }
    }
}
