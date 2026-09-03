package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p71 b;

    public /* synthetic */ l71(p71 p71Var, int i10) {
        this.a = i10;
        this.b = p71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p71 p71Var = this.b;
                p71Var.h = 0.0f;
                y5 y5Var = p71Var.b;
                if (y5Var != null) {
                    y5Var.u();
                    p71Var.b = null;
                    break;
                }
                break;
            case 1:
                p71 p71Var2 = this.b;
                p71Var2.a = true;
                p71Var2.e = null;
                if (p71Var2.b != null) {
                    p71Var2.s = true;
                    PhotoViewer photoViewer = p71Var2.J.a;
                    if (photoViewer.r3) {
                        photoViewer.b3(true);
                        break;
                    }
                }
                break;
            default:
                p71 p71Var3 = this.b;
                p71Var3.a = true;
                p71Var3.e = null;
                if (p71Var3.b != null) {
                    p71Var3.s = true;
                    PhotoViewer photoViewer2 = p71Var3.J.a;
                    if (photoViewer2.r3) {
                        photoViewer2.b3(true);
                        break;
                    }
                }
                break;
        }
    }
}
