package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ l1(int i10, Context context, org.telegram.ui.ActionBar.e2 e2Var) {
        this.a = i10;
        this.b = e2Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.e2 e2Var = this.b;
                if (e2Var != null) {
                    e2Var.dismiss();
                }
                qf.d.r(this.c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                break;
            default:
                org.telegram.ui.ActionBar.e2 e2Var2 = this.b;
                if (e2Var2 != null) {
                    e2Var2.dismiss();
                }
                qf.d.r(this.c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                break;
        }
    }
}
