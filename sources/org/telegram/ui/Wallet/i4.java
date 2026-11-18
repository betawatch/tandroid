package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class i4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m4 b;

    public /* synthetic */ i4(m4 m4Var, int i7) {
        this.a = i7;
        this.b = m4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.u0 u0Var = this.b.a;
                if (u0Var.getParent() instanceof View) {
                    ((View) u0Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                this.b.p();
                break;
        }
    }
}
