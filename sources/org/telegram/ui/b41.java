package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
