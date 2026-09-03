package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w81 b;

    public /* synthetic */ k81(w81 w81Var, int i10) {
        this.a = i10;
        this.b = w81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c.V2.N(true);
                break;
            case 1:
                ze.d.s(this.b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                break;
            case 2:
                w81 w81Var = this.b;
                w81Var.c.postOnAnimation(new k81(w81Var, 3));
                break;
            case 3:
                this.b.i0();
                break;
            default:
                MessagesController.getInstance(this.b.currentAccount).deleteUserPhoto(null);
                break;
        }
    }
}
