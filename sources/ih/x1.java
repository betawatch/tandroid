package ih;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ x1(i4 i4Var, int i9) {
        this.a = i9;
        this.b = i4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                this.b.f2.setVisibility(8);
                break;
            case 1:
                i4 i4Var = this.b;
                if (!i4Var.F0.D0) {
                    i4Var.v3 = null;
                    if (i4Var.D0 == null) {
                        kh.x3 x3Var = new kh.x3(i4Var.getContext(), 3);
                        x3Var.m(1.0f, -22.0f);
                        i4Var.D0 = x3Var;
                        x3Var.h(i0.a.k(i0.a.d(0.13f, -16777216, -1), 240));
                        kh.x3 x3Var2 = i4Var.D0;
                        x3Var2.Q = false;
                        x3Var2.t(LocaleController.getString(R.string.ReactionLongTapHint));
                        i4Var.D0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        i4Var.Y0.addView(i4Var.D0, g7.e6.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, i4Var.t2 ? 0.0f : 56.0f));
                    }
                    i4Var.D0.v();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    break;
                }
                break;
            case 2:
                this.b.Q0();
                break;
            case 3:
                ((d9) this.b.M1).b(true);
                break;
            case 4:
                this.b.r0(true);
                break;
            case 5:
                m9 m9Var = this.b.F0;
                if (m9Var != null) {
                    m9Var.H(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 6:
                this.b.O0();
                break;
            case 7:
                i4 i4Var2 = this.b;
                i4Var2.H3 = 0L;
                p2 p2Var = i4Var2.X1;
                if (p2Var != null) {
                    p2Var.J(true);
                    i4Var2.X1.R1();
                    i4Var2.r0(true);
                    break;
                }
                break;
            case 8:
                i4 i4Var3 = this.b;
                Activity findActivity = AndroidUtilities.findActivity(i4Var3.getContext());
                if (findActivity != null) {
                    h3.g0 g0Var = new h3.g0(13, i4Var3, findActivity);
                    m9 m9Var2 = ((d9) i4Var3.M1).d;
                    l9 l9Var = m9Var2.v0;
                    if (l9Var != null) {
                        z10 = l9Var.release(g0Var);
                        m9Var2.v0 = null;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        AndroidUtilities.runOnUIThread(g0Var, 80L);
                        break;
                    }
                }
                break;
            case 9:
                m9 m9Var3 = ((d9) this.b.M1).d;
                m9Var3.e1 = false;
                m9Var3.P();
                break;
            case 10:
                this.b.L0(null);
                break;
            case 11:
                this.b.c1(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                break;
            default:
                i4 i4Var4 = this.b;
                i4Var4.Q3 = true;
                i4Var4.setActive(false);
                break;
        }
    }
}
