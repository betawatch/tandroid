package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j81 b;

    public /* synthetic */ i81(j81 j81Var, int i10) {
        this.a = i10;
        this.b = j81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb2;
        switch (this.a) {
            case 0:
                j81 j81Var = this.b;
                String str = j81Var.b.text;
                if (str == null || !str.equals("AUTH_TOKEN_EXCEPTION")) {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(j81Var.b.text);
                    sb2 = sb3.toString();
                } else {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                }
                org.telegram.ui.Components.e5.u0(j81Var.c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                break;
            default:
                org.telegram.ui.Components.e5.u0(this.b.c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                break;
        }
    }
}
