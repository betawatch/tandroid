package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.ui.dd0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                vf.c.v(context, gd.M0(2131743961, null), false);
                break;
            case 1:
                vf.c.v(context, gd.M0(2131743961, null), false);
                break;
            default:
                new p6(context.getApplicationContext(), R.drawable.wallet_card_qr, 46, new dd0(11));
                break;
        }
    }
}
