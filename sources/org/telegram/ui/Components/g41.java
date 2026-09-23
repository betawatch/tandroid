package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class g41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3[] b;
    public final /* synthetic */ Context c;

    public /* synthetic */ g41(Context context, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.a = 3;
        this.c = context;
        this.b = f3VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.f3 f3Var;
        org.telegram.ui.ActionBar.n2 n2Var;
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
                ew0 ew0Var = new ew0(this.c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.f3[] f3VarArr = this.b;
                    if (!AndroidUtilities.hasDialogOnTop(f3VarArr[0].attachedFragment) && (f3Var = f3VarArr[0]) != null && (n2Var = f3Var.attachedFragment) != null) {
                        ew0Var.makeAttached(n2Var);
                    }
                }
                ew0Var.show();
                break;
        }
    }

    public /* synthetic */ g41(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, int i10) {
        this.a = i10;
        this.b = f3VarArr;
        this.c = context;
    }
}
