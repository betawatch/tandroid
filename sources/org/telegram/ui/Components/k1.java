package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ k1(int i10, Context context, org.telegram.ui.ActionBar.c2 c2Var) {
        this.a = i10;
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
                nf.f.s(this.c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                break;
            default:
                org.telegram.ui.ActionBar.c2 c2Var2 = this.b;
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                }
                nf.f.s(this.c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                break;
        }
    }
}
