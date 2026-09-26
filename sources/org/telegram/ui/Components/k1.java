package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.a2 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ k1(int i10, Context context, org.telegram.ui.ActionBar.a2 a2Var) {
        this.a = i10;
        this.b = a2Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = this.b;
                if (a2Var != null) {
                    a2Var.dismiss();
                }
                nf.f.s(this.c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                break;
            default:
                org.telegram.ui.ActionBar.a2 a2Var2 = this.b;
                if (a2Var2 != null) {
                    a2Var2.dismiss();
                }
                nf.f.s(this.c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                break;
        }
    }
}
