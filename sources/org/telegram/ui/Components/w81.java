package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a91 b;

    public /* synthetic */ w81(a91 a91Var, int i10) {
        this.a = i10;
        this.b = a91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a91 a91Var = this.b;
                a91Var.h = 0.0f;
                g6 g6Var = a91Var.b;
                if (g6Var != null) {
                    g6Var.u();
                    a91Var.b = null;
                    break;
                }
                break;
            case 1:
                a91 a91Var2 = this.b;
                a91Var2.a = true;
                a91Var2.e = null;
                if (a91Var2.b != null) {
                    a91Var2.s = true;
                    PhotoViewer photoViewer = a91Var2.M.a;
                    if (photoViewer.u3) {
                        photoViewer.e3(true);
                        break;
                    }
                }
                break;
            default:
                a91 a91Var3 = this.b;
                a91Var3.a = true;
                a91Var3.e = null;
                if (a91Var3.b != null) {
                    a91Var3.s = true;
                    PhotoViewer photoViewer2 = a91Var3.M.a;
                    if (photoViewer2.u3) {
                        photoViewer2.e3(true);
                        break;
                    }
                }
                break;
        }
    }
}
