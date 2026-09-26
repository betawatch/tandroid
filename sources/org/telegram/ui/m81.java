package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z81 b;

    public /* synthetic */ m81(z81 z81Var, int i10) {
        this.a = i10;
        this.b = z81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c.Y2.N(true);
                break;
            case 1:
                nf.f.s(this.b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                break;
            case 2:
                z81 z81Var = this.b;
                z81Var.c.postOnAnimation(new m81(z81Var, 3));
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
