package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d41 b;

    public /* synthetic */ b41(d41 d41Var, int i10) {
        this.a = i10;
        this.b = d41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d41 d41Var = this.b;
                e41 e41Var = d41Var.v;
                if (d41Var.a != 0) {
                    e41Var.onBackPressed();
                    break;
                } else {
                    e41Var.dismiss();
                    break;
                }
            default:
                AndroidUtilities.showKeyboard(this.b.n.b);
                break;
        }
    }
}
