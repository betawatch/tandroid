package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.u90;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                new n5(this.b.getApplicationContext(), R.drawable.wallet_card_qr, 46, new u90(13));
                break;
        }
    }
}
