package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q71 b;

    public /* synthetic */ m71(q71 q71Var, int i10) {
        this.a = i10;
        this.b = q71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q71 q71Var = this.b;
                q71Var.h = 0.0f;
                y5 y5Var = q71Var.b;
                if (y5Var != null) {
                    y5Var.u();
                    q71Var.b = null;
                    break;
                }
                break;
            case 1:
                q71 q71Var2 = this.b;
                q71Var2.a = true;
                q71Var2.e = null;
                if (q71Var2.b != null) {
                    q71Var2.s = true;
                    PhotoViewer photoViewer = q71Var2.J.a;
                    if (photoViewer.r3) {
                        photoViewer.b3(true);
                        break;
                    }
                }
                break;
            default:
                q71 q71Var3 = this.b;
                q71Var3.a = true;
                q71Var3.e = null;
                if (q71Var3.b != null) {
                    q71Var3.s = true;
                    PhotoViewer photoViewer2 = q71Var3.J.a;
                    if (photoViewer2.r3) {
                        photoViewer2.b3(true);
                        break;
                    }
                }
                break;
        }
    }
}
