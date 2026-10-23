package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.dx0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ua implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.h3[] b;
    public final /* synthetic */ Context c;

    public /* synthetic */ ua(Context context, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.a = 0;
        this.c = context;
        this.b = h3VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.h3 h3Var;
        org.telegram.ui.ActionBar.o2 o2Var;
        switch (this.a) {
            case 0:
                dx0 dx0Var = new dx0(this.c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.h3[] h3VarArr = this.b;
                    if (!AndroidUtilities.hasDialogOnTop(h3VarArr[0].attachedFragment) && (h3Var = h3VarArr[0]) != null && (o2Var = h3Var.attachedFragment) != null) {
                        dx0Var.makeAttached(o2Var);
                    }
                }
                dx0Var.show();
                break;
            case 1:
                this.b[0].dismiss();
                pf.d.r(this.c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                break;
            case 2:
                this.b[0].dismiss();
                pf.d.t(this.c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                break;
            default:
                this.b[0].dismiss();
                pf.d.r(this.c, LocaleController.getString(R.string.CocoonFooterLink));
                break;
        }
    }

    public /* synthetic */ ua(org.telegram.ui.ActionBar.h3[] h3VarArr, Context context, int i10) {
        this.a = i10;
        this.b = h3VarArr;
        this.c = context;
    }
}
