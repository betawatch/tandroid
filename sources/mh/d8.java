package mh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.fw0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.h3[] b;
    public final /* synthetic */ Context c;

    public /* synthetic */ d8(Context context, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.a = 0;
        this.c = context;
        this.b = h3VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.h3 h3Var;
        org.telegram.ui.ActionBar.p2 p2Var;
        switch (this.a) {
            case 0:
                fw0 fw0Var = new fw0(this.c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.h3[] h3VarArr = this.b;
                    if (!AndroidUtilities.hasDialogOnTop(h3VarArr[0].attachedFragment) && (h3Var = h3VarArr[0]) != null && (p2Var = h3Var.attachedFragment) != null) {
                        fw0Var.makeAttached(p2Var);
                    }
                }
                fw0Var.show();
                break;
            case 1:
                this.b[0].dismiss();
                af.g.s(this.c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                break;
            case 2:
                this.b[0].dismiss();
                af.g.u(this.c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                break;
            default:
                this.b[0].dismiss();
                af.g.s(this.c, LocaleController.getString(R.string.CocoonFooterLink));
                break;
        }
    }

    public /* synthetic */ d8(org.telegram.ui.ActionBar.h3[] h3VarArr, Context context, int i10) {
        this.a = i10;
        this.b = h3VarArr;
        this.c = context;
    }
}
