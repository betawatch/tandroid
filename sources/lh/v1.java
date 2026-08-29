package lh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;

    public /* synthetic */ v1(d4 d4Var, int i10) {
        this.a = i10;
        this.b = d4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                this.b.f2.setVisibility(8);
                break;
            case 1:
                d4 d4Var = this.b;
                if (!d4Var.F0.D0) {
                    d4Var.v3 = null;
                    if (d4Var.D0 == null) {
                        nh.t3 t3Var = new nh.t3(d4Var.getContext(), 3);
                        t3Var.m(1.0f, -22.0f);
                        d4Var.D0 = t3Var;
                        t3Var.h(i0.a.k(i0.a.d(0.13f, -16777216, -1), 240));
                        nh.t3 t3Var2 = d4Var.D0;
                        t3Var2.Q = false;
                        t3Var2.t(LocaleController.getString(R.string.ReactionLongTapHint));
                        d4Var.D0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        d4Var.Y0.addView(d4Var.D0, i7.f6.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, d4Var.t2 ? 0.0f : 56.0f));
                    }
                    d4Var.D0.v();
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
                d4 d4Var2 = this.b;
                d4Var2.H3 = 0L;
                n2 n2Var = d4Var2.X1;
                if (n2Var != null) {
                    n2Var.J(true);
                    d4Var2.X1.R1();
                    d4Var2.r0(true);
                    break;
                }
                break;
            case 8:
                d4 d4Var3 = this.b;
                Activity findActivity = AndroidUtilities.findActivity(d4Var3.getContext());
                if (findActivity != null) {
                    jh.w2 w2Var = new jh.w2(29, d4Var3, findActivity);
                    i9 i9Var2 = ((z8) d4Var3.M1).d;
                    h9 h9Var = i9Var2.v0;
                    if (h9Var != null) {
                        z10 = h9Var.release(w2Var);
                        i9Var2.v0 = null;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        AndroidUtilities.runOnUIThread(w2Var, 80L);
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
                d4 d4Var4 = this.b;
                d4Var4.Q3 = true;
                d4Var4.setActive(false);
                break;
        }
    }
}
