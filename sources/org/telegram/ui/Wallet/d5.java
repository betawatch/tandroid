package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.cd0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ d5(Context context, int i7) {
        this.a = i7;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Context context = this.b;
        switch (i7) {
            case 0:
                vf.c.v(context, hd.N0(2131743953, null), false);
                break;
            case 1:
                vf.c.v(context, hd.N0(2131743953, null), false);
                break;
            default:
                new p6(context.getApplicationContext(), R.drawable.wallet_card_qr, 46, new cd0(11));
                break;
        }
    }
}
