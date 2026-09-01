package oh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f4 b;

    public /* synthetic */ w1(f4 f4Var, int i10) {
        this.a = i10;
        this.b = f4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        switch (this.a) {
            case 0:
                this.b.g2.setVisibility(8);
                break;
            case 1:
                f4 f4Var = this.b;
                if (!f4Var.G0.E0) {
                    f4Var.w3 = null;
                    if (f4Var.E0 == null) {
                        qh.f3 f3Var = new qh.f3(f4Var.getContext(), 3);
                        f3Var.m(1.0f, -22.0f);
                        f4Var.E0 = f3Var;
                        f3Var.h(i0.a.k(i0.a.d(0.13f, -16777216, -1), 240));
                        qh.f3 f3Var2 = f4Var.E0;
                        f3Var2.R = false;
                        f3Var2.t(LocaleController.getString(R.string.ReactionLongTapHint));
                        f4Var.E0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        f4Var.Z0.addView(f4Var.E0, k7.c6.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, f4Var.u2 ? 0.0f : 56.0f));
                    }
                    f4Var.E0.v();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    break;
                }
                break;
            case 2:
                this.b.Q0();
                break;
            case 3:
                ((z8) this.b.N1).b(true);
                break;
            case 4:
                this.b.r0(true);
                break;
            case 5:
                i9 i9Var = this.b.G0;
                if (i9Var != null) {
                    i9Var.H(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 6:
                this.b.O0();
                break;
            case 7:
                f4 f4Var2 = this.b;
                f4Var2.I3 = 0L;
                p2 p2Var = f4Var2.Y1;
                if (p2Var != null) {
                    p2Var.J(true);
                    f4Var2.Y1.R1();
                    f4Var2.r0(true);
                    break;
                }
                break;
            case 8:
                f4 f4Var3 = this.b;
                Activity findActivity = AndroidUtilities.findActivity(f4Var3.getContext());
                if (findActivity != null) {
                    z1 z1Var = new z1(1, f4Var3, findActivity);
                    i9 i9Var2 = ((z8) f4Var3.N1).d;
                    h9 h9Var = i9Var2.w0;
                    if (h9Var != null) {
                        z4 = h9Var.release(z1Var);
                        i9Var2.w0 = null;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        AndroidUtilities.runOnUIThread(z1Var, 80L);
                        break;
                    }
                }
                break;
            case 9:
                i9 i9Var3 = ((z8) this.b.N1).d;
                i9Var3.f1 = false;
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
                f4 f4Var4 = this.b;
                f4Var4.R3 = true;
                f4Var4.setActive(false);
                break;
        }
    }
}
