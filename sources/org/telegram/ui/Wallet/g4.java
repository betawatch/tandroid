package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ g4(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Context context = this.b;
        switch (i10) {
            case 0:
                gf.f.t(context, dd.L0(2131744221, null));
                break;
            case 1:
                gf.f.t(context, dd.L0(2131744221, null));
                break;
            default:
                new c6(context.getApplicationContext(), R.drawable.wallet_card_qr, 46, new org.telegram.ui.Components.voip.n0(21));
                break;
        }
    }
}
