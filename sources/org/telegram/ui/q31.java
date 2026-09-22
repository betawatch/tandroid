package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 d;
    public final /* synthetic */ org.telegram.ui.Components.ny e;

    public /* synthetic */ q31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.ny nyVar, int i10) {
        this.a = i10;
        this.b = n2Var;
        this.c = context;
        this.d = e6Var;
        this.e = nyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.vc.a0(this.b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                break;
            case 1:
                org.telegram.ui.Components.vc.a0(this.b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                break;
            default:
                org.telegram.ui.Components.vc.a0(this.b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                break;
        }
    }
}
