package eg;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2 b;

    public /* synthetic */ h2(w2 w2Var, int i10) {
        this.a = i10;
        this.b = w2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b0(true);
                break;
            case 1:
                this.b.Z.setVisibility(8);
                break;
            case 2:
                w2 w2Var = this.b;
                w2Var.W();
                w2Var.i0(true, false);
                break;
            case 3:
                r2 r2Var = this.b.V;
                r2Var.b.setHintText(LocaleController.getString(R.string.Search), true);
                break;
            case 4:
                r2 r2Var2 = this.b.V;
                r2Var2.b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                break;
            case 5:
                w2 w2Var2 = this.b;
                w2Var2.W();
                w2Var2.i0(true, false);
                break;
            case 6:
                this.b.c0(true);
                break;
            case 7:
                this.b.Z.setVisibility(8);
                break;
            case 8:
                w2 w2Var3 = this.b;
                w2Var3.W();
                w2Var3.i0(true, false);
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
                this.b.h0(true, true);
                break;
            case 11:
                this.b.dismiss();
                break;
            default:
                w2 w2Var4 = this.b;
                w2Var4.W();
                w2Var4.i0(true, false);
                break;
        }
    }
}
