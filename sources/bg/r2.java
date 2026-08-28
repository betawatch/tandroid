package bg;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g3 b;

    public /* synthetic */ r2(g3 g3Var, int i9) {
        this.a = i9;
        this.b = g3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a0(true);
                break;
            case 1:
                this.b.Z.setVisibility(8);
                break;
            case 2:
                g3 g3Var = this.b;
                g3Var.V();
                g3Var.h0(true, false);
                break;
            case 3:
                b3 b3Var = this.b.V;
                b3Var.b.setHintText(LocaleController.getString(R.string.Search), true);
                break;
            case 4:
                b3 b3Var2 = this.b.V;
                b3Var2.b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                break;
            case 5:
                g3 g3Var2 = this.b;
                g3Var2.V();
                g3Var2.h0(true, false);
                break;
            case 6:
                this.b.b0(true);
                break;
            case 7:
                this.b.Z.setVisibility(8);
                break;
            case 8:
                g3 g3Var3 = this.b;
                g3Var3.V();
                g3Var3.h0(true, false);
                break;
            case 9:
                org.telegram.ui.ActionBar.o2 o2Var = this.b.n;
                if (o2Var != null) {
                    org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                    m2Var.a = true;
                    o2Var.showAsSheet(new PrivacyControlActivity(11, false), m2Var);
                    break;
                }
                break;
            case 10:
                this.b.g0(true, true);
                break;
            case 11:
                this.b.dismiss();
                break;
            default:
                g3 g3Var4 = this.b;
                g3Var4.V();
                g3Var4.h0(true, false);
                break;
        }
    }
}
