package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s81 b;

    public /* synthetic */ n81(s81 s81Var, int i10) {
        this.a = i10;
        this.b = s81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s81 s81Var = this.b;
                s81Var.h = 0.0f;
                f6 f6Var = s81Var.b;
                if (f6Var != null) {
                    f6Var.u();
                    s81Var.b = null;
                    break;
                }
                break;
            case 1:
                s81 s81Var2 = this.b;
                s81Var2.a = true;
                s81Var2.e = null;
                if (s81Var2.b != null) {
                    s81Var2.s = true;
                    PhotoViewer photoViewer = s81Var2.M.a;
                    if (photoViewer.u3) {
                        photoViewer.b3(true);
                        break;
                    }
                }
                break;
            default:
                s81 s81Var3 = this.b;
                s81Var3.a = true;
                s81Var3.e = null;
                if (s81Var3.b != null) {
                    s81Var3.s = true;
                    PhotoViewer photoViewer2 = s81Var3.M.a;
                    if (photoViewer2.u3) {
                        photoViewer2.b3(true);
                        break;
                    }
                }
                break;
        }
    }
}
