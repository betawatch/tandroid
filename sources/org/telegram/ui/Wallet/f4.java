package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.ui.o61;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
                vf.c.v(context, id.M0(2131744199, null), false);
                break;
            case 1:
                vf.c.v(context, id.M0(2131744199, null), false);
                break;
            default:
                new y5(context.getApplicationContext(), R.drawable.wallet_card_qr, 46, new o61(5));
                break;
        }
    }
}
