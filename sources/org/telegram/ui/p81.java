package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q81 b;

    public /* synthetic */ p81(q81 q81Var, int i10) {
        this.a = i10;
        this.b = q81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb2;
        switch (this.a) {
            case 0:
                q81 q81Var = this.b;
                String str = q81Var.b.text;
                if (str == null || !str.equals("AUTH_TOKEN_EXCEPTION")) {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.messenger.wl.l(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(q81Var.b.text);
                    sb2 = sb3.toString();
                } else {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                }
                org.telegram.ui.Components.c5.u0(q81Var.c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                break;
            default:
                org.telegram.ui.Components.c5.u0(this.b.c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                break;
        }
    }
}
