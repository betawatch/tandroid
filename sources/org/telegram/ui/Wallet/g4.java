package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ g4(Context context, int i7) {
        this.a = i7;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Context context = this.b;
        switch (i7) {
            case 0:
                vf.c.v(context, hd.M0(2131744197, null), false);
                break;
            case 1:
                vf.c.v(context, hd.M0(2131744197, null), false);
                break;
            default:
                new z5(context.getApplicationContext(), R.drawable.wallet_card_qr, 46, new z(3));
                break;
        }
    }
}
