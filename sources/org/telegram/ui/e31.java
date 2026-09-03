package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 d;
    public final /* synthetic */ org.telegram.ui.Components.b90 e;

    public /* synthetic */ e31(org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.b90 b90Var, int i10) {
        this.a = i10;
        this.b = p2Var;
        this.c = context;
        this.d = g6Var;
        this.e = b90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.qc.a0(this.b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                break;
            case 1:
                org.telegram.ui.Components.qc.a0(this.b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                break;
            default:
                org.telegram.ui.Components.qc.a0(this.b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                break;
        }
    }
}
