package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.w90;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                qf.d.t(this.b, LocaleController.getString(R.string.TermsOfServiceUrl));
                break;
            case 1:
                qf.d.t(this.b, LocaleController.getString(R.string.TermsOfServiceUrl));
                break;
            default:
                new n5(this.b.getApplicationContext(), R.drawable.wallet_card_qr, 46, new w90(14));
                break;
        }
    }
}
