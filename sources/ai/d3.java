package ai;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ d3(f6 f6Var, int i10) {
        this.a = i10;
        this.b = f6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                this.b.j2.setVisibility(8);
                break;
            case 1:
                f6 f6Var = this.b;
                if (!f6Var.J0.H0) {
                    f6Var.z3 = null;
                    if (f6Var.H0 == null) {
                        ci.d4 d4Var = new ci.d4(f6Var.getContext(), 3);
                        d4Var.l(1.0f, -22.0f);
                        f6Var.H0 = d4Var;
                        d4Var.h(i0.a.k(i0.a.d(0.13f, -16777216, -1), 240));
                        ci.d4 d4Var2 = f6Var.H0;
                        d4Var2.U = false;
                        d4Var2.s(LocaleController.getString(R.string.ReactionLongTapHint));
                        f6Var.H0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        f6Var.c1.addView(f6Var.H0, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, f6Var.x2 ? 0.0f : 56.0f, -1, 85));
                    }
                    f6Var.H0.u();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    break;
                }
                break;
            case 2:
                this.b.Q0();
                break;
            case 3:
                ((bc) this.b.Q1).b(true);
                break;
            case 4:
                this.b.r0(true);
                break;
            case 5:
                kc kcVar = this.b.J0;
                if (kcVar != null) {
                    kcVar.H(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 6:
                this.b.O0();
                break;
            case 7:
                f6 f6Var2 = this.b;
                f6Var2.L3 = 0L;
                b4 b4Var = f6Var2.b2;
                if (b4Var != null) {
                    b4Var.I(true);
                    f6Var2.b2.Q1();
                    f6Var2.r0(true);
                    break;
                }
                break;
            case 8:
                f6 f6Var3 = this.b;
                Activity findActivity = AndroidUtilities.findActivity(f6Var3.getContext());
                if (findActivity != null) {
                    a1.f fVar = new a1.f(11, f6Var3, findActivity);
                    kc kcVar2 = ((bc) f6Var3.Q1).d;
                    jc jcVar = kcVar2.z0;
                    if (jcVar != null) {
                        z10 = jcVar.release(fVar);
                        kcVar2.z0 = null;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        AndroidUtilities.runOnUIThread(fVar, 80L);
                        break;
                    }
                }
                break;
            case 9:
                kc kcVar3 = ((bc) this.b.Q1).d;
                kcVar3.i1 = false;
                kcVar3.P();
                break;
            case 10:
                this.b.L0(null);
                break;
            case 11:
                this.b.c1(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                break;
            default:
                f6 f6Var4 = this.b;
                f6Var4.U3 = true;
                f6Var4.setActive(false);
                break;
        }
    }
}
