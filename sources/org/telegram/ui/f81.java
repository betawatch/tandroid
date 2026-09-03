package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g81 b;

    public /* synthetic */ f81(g81 g81Var, int i10) {
        this.a = i10;
        this.b = g81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb;
        switch (this.a) {
            case 0:
                g81 g81Var = this.b;
                String str = g81Var.b.text;
                if (str == null || !str.equals("AUTH_TOKEN_EXCEPTION")) {
                    StringBuilder sb2 = new StringBuilder();
                    b.i(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(g81Var.b.text);
                    sb = sb2.toString();
                } else {
                    sb = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                }
                org.telegram.ui.Components.z4.u0(g81Var.c, LocaleController.getString(R.string.AuthAnotherClient), sb, null);
                break;
            default:
                org.telegram.ui.Components.z4.u0(this.b.c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                break;
        }
    }
}
