package ai;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ c3(f6 f6Var, int i10) {
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
                        ci.f4 f4Var = new ci.f4(f6Var.getContext(), 3);
                        f4Var.l(1.0f, -22.0f);
                        f6Var.H0 = f4Var;
                        f4Var.h(i0.a.k(i0.a.d(0.13f, -16777216, -1), 240));
                        ci.f4 f4Var2 = f6Var.H0;
                        f4Var2.U = false;
                        f4Var2.s(LocaleController.getString(R.string.ReactionLongTapHint));
                        f6Var.H0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        f6Var.c1.addView(f6Var.H0, w7.y5.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, f6Var.x2 ? 0.0f : 56.0f));
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
                ((ac) this.b.Q1).b(true);
                break;
            case 4:
                this.b.r0(true);
                break;
            case 5:
                jc jcVar = this.b.J0;
                if (jcVar != null) {
                    jcVar.H(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 6:
                this.b.O0();
                break;
            case 7:
                f6 f6Var2 = this.b;
                f6Var2.L3 = 0L;
                a4 a4Var = f6Var2.b2;
                if (a4Var != null) {
                    a4Var.K(true);
                    f6Var2.b2.R1();
                    f6Var2.r0(true);
                    break;
                }
                break;
            case 8:
                f6 f6Var3 = this.b;
                Activity findActivity = AndroidUtilities.findActivity(f6Var3.getContext());
                if (findActivity != null) {
                    a1.e eVar = new a1.e(11, f6Var3, findActivity);
                    jc jcVar2 = ((ac) f6Var3.Q1).d;
                    ic icVar = jcVar2.z0;
                    if (icVar != null) {
                        z10 = icVar.release(eVar);
                        jcVar2.z0 = null;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        AndroidUtilities.runOnUIThread(eVar, 80L);
                        break;
                    }
                }
                break;
            case 9:
                jc jcVar3 = ((ac) this.b.Q1).d;
                jcVar3.i1 = false;
                jcVar3.P();
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
