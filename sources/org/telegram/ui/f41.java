package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class f41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h41 b;

    public /* synthetic */ f41(h41 h41Var, int i10) {
        this.a = i10;
        this.b = h41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h41 h41Var = this.b;
                i41 i41Var = h41Var.v;
                if (h41Var.a != 0) {
                    i41Var.onBackPressed();
                    break;
                } else {
                    i41Var.dismiss();
                    break;
                }
            default:
                AndroidUtilities.showKeyboard(this.b.n.b);
                break;
        }
    }
}
