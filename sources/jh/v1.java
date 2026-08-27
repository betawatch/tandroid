package jh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;

    public /* synthetic */ v1(e4 e4Var, int i10) {
        this.a = i10;
        this.b = e4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                this.b.f2.setVisibility(8);
                break;
            case 1:
                e4 e4Var = this.b;
                if (!e4Var.F0.D0) {
                    e4Var.v3 = null;
                    if (e4Var.D0 == null) {
                        lh.w3 w3Var = new lh.w3(e4Var.getContext(), 3);
                        w3Var.m(1.0f, -22.0f);
                        e4Var.D0 = w3Var;
                        w3Var.h(i0.b.k(i0.b.d(0.13f, -16777216, -1), 240));
                        lh.w3 w3Var2 = e4Var.D0;
                        w3Var2.Q = false;
                        w3Var2.t(LocaleController.getString(R.string.ReactionLongTapHint));
                        e4Var.D0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        e4Var.Y0.addView(e4Var.D0, h7.z5.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, e4Var.t2 ? 0.0f : 56.0f));
                    }
                    e4Var.D0.v();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    break;
                }
                break;
            case 2:
                this.b.Q0();
                break;
            case 3:
                ((z8) this.b.M1).b(true);
                break;
            case 4:
                this.b.r0(true);
                break;
            case 5:
                i9 i9Var = this.b.F0;
                if (i9Var != null) {
                    i9Var.H(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 6:
                this.b.O0();
                break;
            case 7:
                e4 e4Var2 = this.b;
                e4Var2.H3 = 0L;
                o2 o2Var = e4Var2.X1;
                if (o2Var != null) {
                    o2Var.K(true);
                    e4Var2.X1.Q1();
                    e4Var2.r0(true);
                    break;
                }
                break;
            case 8:
                e4 e4Var3 = this.b;
                Activity findActivity = AndroidUtilities.findActivity(e4Var3.getContext());
                if (findActivity != null) {
                    hh.m5 m5Var = new hh.m5(22, e4Var3, findActivity);
                    i9 i9Var2 = ((z8) e4Var3.M1).d;
                    h9 h9Var = i9Var2.v0;
                    if (h9Var != null) {
                        z10 = h9Var.release(m5Var);
                        i9Var2.v0 = null;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        AndroidUtilities.runOnUIThread(m5Var, 80L);
                        break;
                    }
                }
                break;
            case 9:
                i9 i9Var3 = ((z8) this.b.M1).d;
                i9Var3.e1 = false;
                i9Var3.P();
                break;
            case 10:
                this.b.L0(null);
                break;
            case 11:
                this.b.c1(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                break;
            default:
                e4 e4Var4 = this.b;
                e4Var4.Q3 = true;
                e4Var4.setActive(false);
                break;
        }
    }
}
