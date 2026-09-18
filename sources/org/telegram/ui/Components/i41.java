package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g3[] b;
    public final /* synthetic */ Context c;

    public /* synthetic */ i41(Context context, org.telegram.ui.ActionBar.g3[] g3VarArr) {
        this.a = 3;
        this.c = context;
        this.b = g3VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.g3 g3Var;
        org.telegram.ui.ActionBar.o2 o2Var;
        switch (this.a) {
            case 0:
                this.b[0].dismiss();
                nf.f.s(this.c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                break;
            case 1:
                this.b[0].dismiss();
                nf.f.u(this.c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                break;
            case 2:
                this.b[0].dismiss();
                nf.f.s(this.c, LocaleController.getString(R.string.CocoonFooterLink));
                break;
            default:
                fw0 fw0Var = new fw0(this.c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.g3[] g3VarArr = this.b;
                    if (!AndroidUtilities.hasDialogOnTop(g3VarArr[0].attachedFragment) && (g3Var = g3VarArr[0]) != null && (o2Var = g3Var.attachedFragment) != null) {
                        fw0Var.makeAttached(o2Var);
                    }
                }
                fw0Var.show();
                break;
        }
    }

    public /* synthetic */ i41(org.telegram.ui.ActionBar.g3[] g3VarArr, Context context, int i10) {
        this.a = i10;
        this.b = g3VarArr;
        this.c = context;
    }
}
