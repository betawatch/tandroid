package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.ui.q61;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                vf.c.v(context, id.M0(2131744196, null), false);
                break;
            case 1:
                vf.c.v(context, id.M0(2131744196, null), false);
                break;
            default:
                new a6(context.getApplicationContext(), R.drawable.wallet_card_qr, 46, new q61(5));
                break;
        }
    }
}
