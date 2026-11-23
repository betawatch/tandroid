package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                org.telegram.ui.Cells.v0 v0Var = this.b.a;
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                this.b.p();
                break;
        }
    }
}
