package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z71 b;

    public /* synthetic */ m71(z71 z71Var, int i9) {
        this.a = i9;
        this.b = z71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c.U2.N(true);
                break;
            case 1:
                ve.e.s(this.b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                break;
            case 2:
                z71 z71Var = this.b;
                z71Var.c.postOnAnimation(new m71(z71Var, 3));
                break;
            case 3:
                this.b.h0();
                break;
            default:
                MessagesController.getInstance(this.b.currentAccount).deleteUserPhoto(null);
                break;
        }
    }
}
