package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h81 b;

    public /* synthetic */ g81(h81 h81Var, int i10) {
        this.a = i10;
        this.b = h81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb;
        switch (this.a) {
            case 0:
                h81 h81Var = this.b;
                String str = h81Var.b.text;
                if (str == null || !str.equals("AUTH_TOKEN_EXCEPTION")) {
                    StringBuilder sb2 = new StringBuilder();
                    b.i(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(h81Var.b.text);
                    sb = sb2.toString();
                } else {
                    sb = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                }
                org.telegram.ui.Components.z4.u0(h81Var.c, LocaleController.getString(R.string.AuthAnotherClient), sb, null);
                break;
            default:
                org.telegram.ui.Components.z4.u0(this.b.c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                break;
        }
    }
}
