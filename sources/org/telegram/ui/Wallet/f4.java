package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.ah0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
