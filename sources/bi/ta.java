package bi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.lx0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ta implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.k3[] b;
    public final /* synthetic */ Context c;

    public /* synthetic */ ta(Context context, org.telegram.ui.ActionBar.k3[] k3VarArr) {
        this.a = 0;
        this.c = context;
        this.b = k3VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.k3 k3Var;
        org.telegram.ui.ActionBar.r2 r2Var;
        switch (this.a) {
            case 0:
                lx0 lx0Var = new lx0(this.c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.k3[] k3VarArr = this.b;
                    if (!AndroidUtilities.hasDialogOnTop(k3VarArr[0].attachedFragment) && (k3Var = k3VarArr[0]) != null && (r2Var = k3Var.attachedFragment) != null) {
                        lx0Var.makeAttached(r2Var);
                    }
                }
                lx0Var.show();
                break;
            case 1:
                this.b[0].dismiss();
                qf.d.r(this.c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                break;
            case 2:
                this.b[0].dismiss();
                qf.d.t(this.c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                break;
            default:
                this.b[0].dismiss();
                qf.d.r(this.c, LocaleController.getString(R.string.CocoonFooterLink));
                break;
        }
    }

    public /* synthetic */ ta(org.telegram.ui.ActionBar.k3[] k3VarArr, Context context, int i10) {
        this.a = i10;
        this.b = k3VarArr;
        this.c = context;
    }
}
