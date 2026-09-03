package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
