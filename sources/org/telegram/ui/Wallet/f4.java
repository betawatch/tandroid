package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.ah0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class f4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ f4(Context context, int i7) {
        this.a = i7;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Context context = this.b;
        switch (i7) {
            case 0:
                vf.c.v(context, hd.M0(2131744196, null), false);
                break;
            case 1:
                vf.c.v(context, hd.M0(2131744196, null), false);
                break;
            default:
                new z5(context.getApplicationContext(), R.drawable.wallet_card_qr, 46, new ah0(9));
                break;
        }
    }
}
