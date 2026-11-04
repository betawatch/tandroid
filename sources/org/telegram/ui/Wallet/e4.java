package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.ui.hb1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class e4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ e4(Context context, int i3) {
        this.a = i3;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        Context context = this.b;
        switch (i3) {
            case 0:
                sf.c.v(context, bd.M0(2131744206, null), false);
                break;
            case 1:
                sf.c.v(context, bd.M0(2131744206, null), false);
                break;
            default:
                new x5(context.getApplicationContext(), R.drawable.wallet_card_qr, 46, new hb1(4));
                break;
        }
    }
}
