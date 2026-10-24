package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class n71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c81 b;

    public /* synthetic */ n71(c81 c81Var, int i10) {
        this.a = i10;
        this.b = c81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.getInstance(this.b.currentAccount).deleteUserPhoto(null);
                break;
            case 1:
                this.b.c.Z2.N(true);
                break;
            case 2:
                pf.d.r(this.b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                break;
            case 3:
                c81 c81Var = this.b;
                c81Var.c.postOnAnimation(new n71(c81Var, 4));
                break;
            default:
                this.b.k0();
                break;
        }
    }
}
