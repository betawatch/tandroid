package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class j51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e3[] b;
    public final /* synthetic */ Context c;

    public /* synthetic */ j51(Context context, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.a = 3;
        this.c = context;
        this.b = e3VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.e3 e3Var;
        org.telegram.ui.ActionBar.m2 m2Var;
        switch (this.a) {
            case 0:
                this.b[0].dismiss();
                pf.d.s(this.c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                break;
            case 1:
                this.b[0].dismiss();
                pf.d.u(this.c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                break;
            case 2:
                this.b[0].dismiss();
                pf.d.s(this.c, LocaleController.getString(R.string.CocoonFooterLink));
                break;
            default:
                dx0 dx0Var = new dx0(this.c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.e3[] e3VarArr = this.b;
                    if (!AndroidUtilities.hasDialogOnTop(e3VarArr[0].attachedFragment) && (e3Var = e3VarArr[0]) != null && (m2Var = e3Var.attachedFragment) != null) {
                        dx0Var.makeAttached(m2Var);
                    }
                }
                dx0Var.show();
                break;
        }
    }

    public /* synthetic */ j51(org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, int i10) {
        this.a = i10;
        this.b = e3VarArr;
        this.c = context;
    }
}
