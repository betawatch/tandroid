package gg;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;

    public /* synthetic */ g2(v2 v2Var, int i10) {
        this.a = i10;
        this.b = v2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b0(true);
                break;
            case 1:
                this.b.a0.setVisibility(8);
                break;
            case 2:
                v2 v2Var = this.b;
                v2Var.W();
                v2Var.i0(true, false);
                break;
            case 3:
                q2 q2Var = this.b.W;
                q2Var.b.setHintText(LocaleController.getString(R.string.Search), true);
                break;
            case 4:
                q2 q2Var2 = this.b.W;
                q2Var2.b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                break;
            case 5:
                v2 v2Var2 = this.b;
                v2Var2.W();
                v2Var2.i0(true, false);
                break;
            case 6:
                this.b.c0(true);
                break;
            case 7:
                this.b.a0.setVisibility(8);
                break;
            case 8:
                v2 v2Var3 = this.b;
                v2Var3.W();
                v2Var3.i0(true, false);
                break;
            case 9:
                org.telegram.ui.ActionBar.p2 p2Var = this.b.n;
                if (p2Var != null) {
                    org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                    n2Var.a = true;
                    p2Var.showAsSheet(new PrivacyControlActivity(11, false), n2Var);
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
                v2 v2Var4 = this.b;
                v2Var4.W();
                v2Var4.i0(true, false);
                break;
        }
    }
}
