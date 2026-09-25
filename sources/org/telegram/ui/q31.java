package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s31 b;

    public /* synthetic */ q31(s31 s31Var, int i10) {
        this.a = i10;
        this.b = s31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s31 s31Var = this.b;
                t31 t31Var = s31Var.v;
                if (s31Var.a != 0) {
                    t31Var.onBackPressed();
                    break;
                } else {
                    t31Var.dismiss();
                    break;
                }
            default:
                AndroidUtilities.showKeyboard(this.b.n.b);
                break;
        }
    }
}
