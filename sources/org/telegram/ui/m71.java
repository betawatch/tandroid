package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o71 b;

    public /* synthetic */ m71(o71 o71Var, int i10) {
        this.a = i10;
        this.b = o71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb2;
        switch (this.a) {
            case 0:
                o71 o71Var = this.b;
                String str = o71Var.b.text;
                if (str == null || !str.equals("AUTH_TOKEN_EXCEPTION")) {
                    StringBuilder sb3 = new StringBuilder();
                    d3.p(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(o71Var.b.text);
                    sb2 = sb3.toString();
                } else {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                }
                org.telegram.ui.Components.g5.t0(o71Var.c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                break;
            default:
                org.telegram.ui.Components.g5.t0(this.b.c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                break;
        }
    }
}
