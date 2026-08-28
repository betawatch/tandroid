package gh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mv0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class f8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3[] b;
    public final /* synthetic */ Context c;

    public /* synthetic */ f8(Context context, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.a = 0;
        this.c = context;
        this.b = f3VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.f3 f3Var;
        org.telegram.ui.ActionBar.o2 o2Var;
        switch (this.a) {
            case 0:
                mv0 mv0Var = new mv0(this.c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.f3[] f3VarArr = this.b;
                    if (!AndroidUtilities.hasDialogOnTop(f3VarArr[0].attachedFragment) && (f3Var = f3VarArr[0]) != null && (o2Var = f3Var.attachedFragment) != null) {
                        mv0Var.makeAttached(o2Var);
                    }
                }
                mv0Var.show();
                break;
            case 1:
                this.b[0].dismiss();
                ve.e.s(this.c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                break;
            case 2:
                this.b[0].dismiss();
                ve.e.u(this.c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                break;
            default:
                this.b[0].dismiss();
                ve.e.s(this.c, LocaleController.getString(R.string.CocoonFooterLink));
                break;
        }
    }

    public /* synthetic */ f8(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, int i9) {
        this.a = i9;
        this.b = f3VarArr;
        this.c = context;
    }
}
