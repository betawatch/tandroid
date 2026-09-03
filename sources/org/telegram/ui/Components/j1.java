package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ j1(int i10, Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        this.a = i10;
        this.b = d2Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = this.b;
                if (d2Var != null) {
                    d2Var.dismiss();
                }
                ze.d.s(this.c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                break;
            default:
                org.telegram.ui.ActionBar.d2 d2Var2 = this.b;
                if (d2Var2 != null) {
                    d2Var2.dismiss();
                }
                ze.d.s(this.c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                break;
        }
    }
}
