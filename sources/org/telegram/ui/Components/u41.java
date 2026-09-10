package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class u41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.h3[] b;
    public final /* synthetic */ Context c;

    public /* synthetic */ u41(Context context, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.a = 3;
        this.c = context;
        this.b = h3VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.h3 h3Var;
        org.telegram.ui.ActionBar.p2 p2Var;
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
                pw0 pw0Var = new pw0(this.c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.h3[] h3VarArr = this.b;
                    if (!AndroidUtilities.hasDialogOnTop(h3VarArr[0].attachedFragment) && (h3Var = h3VarArr[0]) != null && (p2Var = h3Var.attachedFragment) != null) {
                        pw0Var.makeAttached(p2Var);
                    }
                }
                pw0Var.show();
                break;
        }
    }

    public /* synthetic */ u41(org.telegram.ui.ActionBar.h3[] h3VarArr, Context context, int i10) {
        this.a = i10;
        this.b = h3VarArr;
        this.c = context;
    }
}
