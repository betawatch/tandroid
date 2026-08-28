package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 d;
    public final /* synthetic */ org.telegram.ui.Components.jg0 e;

    public /* synthetic */ k21(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.Components.jg0 jg0Var, int i9) {
        this.a = i9;
        this.b = o2Var;
        this.c = context;
        this.d = b6Var;
        this.e = jg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.oc.a0(this.b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new cv(this.c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                break;
            case 1:
                org.telegram.ui.Components.oc.a0(this.b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new cv(this.c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                break;
            default:
                org.telegram.ui.Components.oc.a0(this.b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new cv(this.c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                break;
        }
    }
}
