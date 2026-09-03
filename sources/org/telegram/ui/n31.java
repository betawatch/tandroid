package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p31 b;

    public /* synthetic */ n31(p31 p31Var, int i10) {
        this.a = i10;
        this.b = p31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p31 p31Var = this.b;
                q31 q31Var = p31Var.v;
                if (p31Var.a != 0) {
                    q31Var.onBackPressed();
                    break;
                } else {
                    q31Var.dismiss();
                    break;
                }
            default:
                AndroidUtilities.showKeyboard(this.b.n.b);
                break;
        }
    }
}
