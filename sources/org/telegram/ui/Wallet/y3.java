package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c4 b;

    public /* synthetic */ y3(c4 c4Var, int i7) {
        this.a = i7;
        this.b = c4Var;
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
