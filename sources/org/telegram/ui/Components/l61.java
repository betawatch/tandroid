package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o61 b;

    public /* synthetic */ l61(o61 o61Var, int i7) {
        this.a = i7;
        this.b = o61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o61 o61Var = this.b;
                o61Var.h = 0.0f;
                c6 c6Var = o61Var.b;
                if (c6Var != null) {
                    c6Var.u();
                    o61Var.b = null;
                    break;
                }
                break;
            case 1:
                o61 o61Var2 = this.b;
                o61Var2.a = true;
                o61Var2.e = null;
                if (o61Var2.b != null) {
                    o61Var2.s = true;
                    PhotoViewer photoViewer = o61Var2.N.a;
                    if (photoViewer.u3) {
                        photoViewer.Z2(true);
                        break;
                    }
                }
                break;
            default:
                o61 o61Var3 = this.b;
                o61Var3.a = true;
                o61Var3.e = null;
                if (o61Var3.b != null) {
                    o61Var3.s = true;
                    PhotoViewer photoViewer2 = o61Var3.N.a;
                    if (photoViewer2.u3) {
                        photoViewer2.Z2(true);
                        break;
                    }
                }
                break;
        }
    }
}
