package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ j1(int i9, Context context, org.telegram.ui.ActionBar.c2 c2Var) {
        this.a = i9;
        this.b = c2Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.c2 c2Var = this.b;
                if (c2Var != null) {
                    c2Var.dismiss();
                }
                ve.e.s(this.c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                break;
            default:
                org.telegram.ui.ActionBar.c2 c2Var2 = this.b;
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                }
                ve.e.s(this.c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                break;
        }
    }
}
