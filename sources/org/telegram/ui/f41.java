package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
