package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l61 b;

    public /* synthetic */ i61(l61 l61Var, int i7) {
        this.a = i7;
        this.b = l61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l61 l61Var = this.b;
                l61Var.h = 0.0f;
                b6 b6Var = l61Var.b;
                if (b6Var != null) {
                    b6Var.u();
                    l61Var.b = null;
                    break;
                }
                break;
            case 1:
                l61 l61Var2 = this.b;
                l61Var2.a = true;
                l61Var2.e = null;
                if (l61Var2.b != null) {
                    l61Var2.s = true;
                    PhotoViewer photoViewer = l61Var2.N.a;
                    if (photoViewer.u3) {
                        photoViewer.Z2(true);
                        break;
                    }
                }
                break;
            default:
                l61 l61Var3 = this.b;
                l61Var3.a = true;
                l61Var3.e = null;
                if (l61Var3.b != null) {
                    l61Var3.s = true;
                    PhotoViewer photoViewer2 = l61Var3.N.a;
                    if (photoViewer2.u3) {
                        photoViewer2.Z2(true);
                        break;
                    }
                }
                break;
        }
    }
}
