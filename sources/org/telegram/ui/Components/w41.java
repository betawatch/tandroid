package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e3[] b;
    public final /* synthetic */ Context c;

    public /* synthetic */ w41(Context context, org.telegram.ui.ActionBar.e3[] e3VarArr) {
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
                rw0 rw0Var = new rw0(this.c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.e3[] e3VarArr = this.b;
                    if (!AndroidUtilities.hasDialogOnTop(e3VarArr[0].attachedFragment) && (e3Var = e3VarArr[0]) != null && (m2Var = e3Var.attachedFragment) != null) {
                        rw0Var.makeAttached(m2Var);
                    }
                }
                rw0Var.show();
                break;
        }
    }

    public /* synthetic */ w41(org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, int i10) {
        this.a = i10;
        this.b = e3VarArr;
        this.c = context;
    }
}
