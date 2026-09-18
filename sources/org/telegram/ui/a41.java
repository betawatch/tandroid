package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c41 b;

    public /* synthetic */ a41(c41 c41Var, int i10) {
        this.a = i10;
        this.b = c41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c41 c41Var = this.b;
                d41 d41Var = c41Var.v;
                if (c41Var.a != 0) {
                    d41Var.onBackPressed();
                    break;
                } else {
                    d41Var.dismiss();
                    break;
                }
            default:
                AndroidUtilities.showKeyboard(this.b.n.b);
                break;
        }
    }
}
