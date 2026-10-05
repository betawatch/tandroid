package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y81 b;

    public /* synthetic */ l81(y81 y81Var, int i10) {
        this.a = i10;
        this.b = y81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.getInstance(this.b.currentAccount).deleteUserPhoto(null);
                break;
            case 1:
                nf.f.s(this.b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                break;
            default:
                this.b.c.f3.N(true);
                break;
        }
    }
}
