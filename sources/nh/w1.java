package nh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;

    public /* synthetic */ w1(d4 d4Var, int i10) {
        this.a = i10;
        this.b = d4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        switch (this.a) {
            case 0:
                this.b.g2.setVisibility(8);
                break;
            case 1:
                d4 d4Var = this.b;
                if (!d4Var.G0.E0) {
                    d4Var.w3 = null;
                    if (d4Var.E0 == null) {
                        ph.f3 f3Var = new ph.f3(d4Var.getContext(), 3);
                        f3Var.l(1.0f, -22.0f);
                        d4Var.E0 = f3Var;
                        f3Var.h(i0.a.k(i0.a.d(0.13f, -16777216, -1), 240));
                        ph.f3 f3Var2 = d4Var.E0;
                        f3Var2.R = false;
                        f3Var2.s(LocaleController.getString(R.string.ReactionLongTapHint));
                        d4Var.E0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        d4Var.Z0.addView(d4Var.E0, k7.b6.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, d4Var.u2 ? 0.0f : 56.0f));
                    }
                    d4Var.E0.u();
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
                d4 d4Var2 = this.b;
                d4Var2.I3 = 0L;
                o2 o2Var = d4Var2.Y1;
                if (o2Var != null) {
                    o2Var.J(true);
                    d4Var2.Y1.R1();
                    d4Var2.r0(true);
                    break;
                }
                break;
            case 8:
                d4 d4Var3 = this.b;
                Activity findActivity = AndroidUtilities.findActivity(d4Var3.getContext());
                if (findActivity != null) {
                    lh.n2 n2Var = new lh.n2(28, d4Var3, findActivity);
                    i9 i9Var2 = ((z8) d4Var3.N1).d;
                    h9 h9Var = i9Var2.w0;
                    if (h9Var != null) {
                        z4 = h9Var.release(n2Var);
                        i9Var2.w0 = null;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        AndroidUtilities.runOnUIThread(n2Var, 80L);
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
                d4 d4Var4 = this.b;
                d4Var4.R3 = true;
                d4Var4.setActive(false);
                break;
        }
    }
}
