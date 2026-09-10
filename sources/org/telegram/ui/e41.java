package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class e41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g41 b;

    public /* synthetic */ e41(g41 g41Var, int i10) {
        this.a = i10;
        this.b = g41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g41 g41Var = this.b;
                h41 h41Var = g41Var.v;
                if (g41Var.a != 0) {
                    h41Var.onBackPressed();
                    break;
                } else {
                    h41Var.dismiss();
                    break;
                }
            default:
                AndroidUtilities.showKeyboard(this.b.n.b);
                break;
        }
    }
}
