package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j71 b;

    public /* synthetic */ i71(j71 j71Var, int i9) {
        this.a = i9;
        this.b = j71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb2;
        switch (this.a) {
            case 0:
                j71 j71Var = this.b;
                String str = j71Var.b.text;
                if (str == null || !str.equals("AUTH_TOKEN_EXCEPTION")) {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.j2.k(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(j71Var.b.text);
                    sb2 = sb3.toString();
                } else {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                }
                org.telegram.ui.Components.y4.u0(j71Var.c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                break;
            default:
                org.telegram.ui.Components.y4.u0(this.b.c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                break;
        }
    }
}
