package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p81 b;

    public /* synthetic */ o81(p81 p81Var, int i10) {
        this.a = i10;
        this.b = p81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb2;
        switch (this.a) {
            case 0:
                p81 p81Var = this.b;
                String str = p81Var.b.text;
                if (str == null || !str.equals("AUTH_TOKEN_EXCEPTION")) {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.messenger.vl.m(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(p81Var.b.text);
                    sb2 = sb3.toString();
                } else {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                }
                org.telegram.ui.Components.c5.u0(p81Var.c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                break;
            default:
                org.telegram.ui.Components.c5.u0(this.b.c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                break;
        }
    }
}
