package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.if0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ p3(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pf.d.t(this.b, LocaleController.getString(R.string.TermsOfServiceUrl));
                break;
            case 1:
                pf.d.t(this.b, LocaleController.getString(R.string.TermsOfServiceUrl));
                break;
            default:
                new p5(this.b.getApplicationContext(), R.drawable.wallet_card_qr, 46, new if0(10));
                break;
        }
    }
}
