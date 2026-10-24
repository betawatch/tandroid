package ci;

import ai.qa;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p4 b;

    public /* synthetic */ c2(p4 p4Var, int i10) {
        this.a = i10;
        this.b = p4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                this.b.j2.setVisibility(8);
                break;
            case 1:
                p4 p4Var = this.b;
                if (!p4Var.J0.H0) {
                    p4Var.z3 = null;
                    if (p4Var.H0 == null) {
                        ei.x3 x3Var = new ei.x3(p4Var.getContext(), 3);
                        x3Var.l(1.0f, -22.0f);
                        p4Var.H0 = x3Var;
                        x3Var.h(i0.a.o(i0.a.f(0.13f, -16777216, -1), 240));
                        ei.x3 x3Var2 = p4Var.H0;
                        x3Var2.U = false;
                        x3Var2.s(LocaleController.getString(R.string.ReactionLongTapHint));
                        p4Var.H0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        p4Var.c1.addView(p4Var.H0, w7.z5.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, p4Var.x2 ? 0.0f : 56.0f));
                    }
                    p4Var.H0.u();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    break;
                }
                break;
            case 2:
                this.b.P0();
                break;
            case 3:
                ((q9) this.b.Q1).b(true);
                break;
            case 4:
                this.b.q0(true);
                break;
            case 5:
                z9 z9Var = this.b.J0;
                if (z9Var != null) {
                    z9Var.H(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 6:
                this.b.N0();
                break;
            case 7:
                p4 p4Var2 = this.b;
                p4Var2.L3 = 0L;
                u2 u2Var = p4Var2.b2;
                if (u2Var != null) {
                    u2Var.F(true);
                    p4Var2.b2.O1();
                    p4Var2.q0(true);
                    break;
                }
                break;
            case 8:
                p4 p4Var3 = this.b;
                Activity findActivity = AndroidUtilities.findActivity(p4Var3.getContext());
                if (findActivity != null) {
                    qa qaVar = new qa(15, p4Var3, findActivity);
                    z9 z9Var2 = ((q9) p4Var3.Q1).d;
                    y9 y9Var = z9Var2.z0;
                    if (y9Var != null) {
                        z10 = y9Var.release(qaVar);
                        z9Var2.z0 = null;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        AndroidUtilities.runOnUIThread(qaVar, 80L);
                        break;
                    }
                }
                break;
            case 9:
                z9 z9Var3 = ((q9) this.b.Q1).d;
                z9Var3.i1 = false;
                z9Var3.P();
                break;
            case 10:
                this.b.K0(null);
                break;
            case 11:
                this.b.b1(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                break;
            default:
                p4 p4Var4 = this.b;
                p4Var4.U3 = true;
                p4Var4.setActive(false);
                break;
        }
    }
}
