package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ k1(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.a = i10;
        this.b = b2Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.b;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                nf.f.s(this.c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                break;
            default:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.b;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                }
                nf.f.s(this.c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                break;
        }
    }
}
