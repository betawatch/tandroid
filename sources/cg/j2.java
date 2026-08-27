package cg;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y2 b;

    public /* synthetic */ j2(y2 y2Var, int i10) {
        this.a = i10;
        this.b = y2Var;
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
                y2 y2Var = this.b;
                y2Var.W();
                y2Var.i0(true, false);
                break;
            case 3:
                t2 t2Var = this.b.V;
                t2Var.b.setHintText(LocaleController.getString(R.string.Search), true);
                break;
            case 4:
                t2 t2Var2 = this.b.V;
                t2Var2.b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                break;
            case 5:
                y2 y2Var2 = this.b;
                y2Var2.W();
                y2Var2.i0(true, false);
                break;
            case 6:
                this.b.c0(true);
                break;
            case 7:
                this.b.Z.setVisibility(8);
                break;
            case 8:
                y2 y2Var3 = this.b;
                y2Var3.W();
                y2Var3.i0(true, false);
                break;
            case 9:
                org.telegram.ui.ActionBar.n2 n2Var = this.b.n;
                if (n2Var != null) {
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.a = true;
                    n2Var.showAsSheet(new PrivacyControlActivity(11, false), l2Var);
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
                y2 y2Var4 = this.b;
                y2Var4.W();
                y2Var4.i0(true, false);
                break;
        }
    }
}
