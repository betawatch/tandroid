package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;

    public /* synthetic */ z3(d4 d4Var, int i7) {
        this.a = i7;
        this.b = d4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.t0 t0Var = this.b.a;
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                this.b.p();
                break;
        }
    }
}
