package ci;

import ai.pa;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class d2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q4 b;

    public /* synthetic */ d2(q4 q4Var, int i10) {
        this.a = i10;
        this.b = q4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                this.b.j2.setVisibility(8);
                break;
            case 1:
                q4 q4Var = this.b;
                if (!q4Var.J0.H0) {
                    q4Var.z3 = null;
                    if (q4Var.H0 == null) {
                        ei.x3 x3Var = new ei.x3(q4Var.getContext(), 3);
                        x3Var.l(1.0f, -22.0f);
                        q4Var.H0 = x3Var;
                        x3Var.h(i0.a.o(i0.a.f(0.13f, -16777216, -1), 240));
                        ei.x3 x3Var2 = q4Var.H0;
                        x3Var2.U = false;
                        x3Var2.s(LocaleController.getString(R.string.ReactionLongTapHint));
                        q4Var.H0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        q4Var.c1.addView(q4Var.H0, w7.z5.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, q4Var.x2 ? 0.0f : 56.0f));
                    }
                    q4Var.H0.u();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    break;
                }
                break;
            case 2:
                this.b.Q0();
                break;
            case 3:
                ((r9) this.b.Q1).b(true);
                break;
            case 4:
                this.b.r0(true);
                break;
            case 5:
                aa aaVar = this.b.J0;
                if (aaVar != null) {
                    aaVar.H(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 6:
                this.b.O0();
                break;
            case 7:
                q4 q4Var2 = this.b;
                q4Var2.L3 = 0L;
                v2 v2Var = q4Var2.b2;
                if (v2Var != null) {
                    v2Var.I(true);
                    q4Var2.b2.O1();
                    q4Var2.r0(true);
                    break;
                }
                break;
            case 8:
                q4 q4Var3 = this.b;
                Activity findActivity = AndroidUtilities.findActivity(q4Var3.getContext());
                if (findActivity != null) {
                    pa paVar = new pa(15, q4Var3, findActivity);
                    aa aaVar2 = ((r9) q4Var3.Q1).d;
                    z9 z9Var = aaVar2.z0;
                    if (z9Var != null) {
                        z10 = z9Var.release(paVar);
                        aaVar2.z0 = null;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        AndroidUtilities.runOnUIThread(paVar, 80L);
                        break;
                    }
                }
                break;
            case 9:
                aa aaVar3 = ((r9) this.b.Q1).d;
                aaVar3.i1 = false;
                aaVar3.P();
                break;
            case 10:
                this.b.L0(null);
                break;
            case 11:
                this.b.c1(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                break;
            default:
                q4 q4Var4 = this.b;
                q4Var4.U3 = true;
                q4Var4.setActive(false);
                break;
        }
    }
}
