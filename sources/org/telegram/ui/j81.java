package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v81 b;

    public /* synthetic */ j81(v81 v81Var, int i10) {
        this.a = i10;
        this.b = v81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c.V2.N(true);
                break;
            case 1:
                af.g.s(this.b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                break;
            case 2:
                v81 v81Var = this.b;
                v81Var.c.postOnAnimation(new j81(v81Var, 3));
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
