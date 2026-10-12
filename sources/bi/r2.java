package bi;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class r2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q5 b;

    public /* synthetic */ r2(q5 q5Var, int i10) {
        this.a = i10;
        this.b = q5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                this.b.j2.setVisibility(8);
                break;
            case 1:
                q5 q5Var = this.b;
                if (!q5Var.J0.H0) {
                    q5Var.z3 = null;
                    if (q5Var.H0 == null) {
                        di.d4 d4Var = new di.d4(q5Var.getContext(), 3);
                        d4Var.l(1.0f, -22.0f);
                        q5Var.H0 = d4Var;
                        d4Var.h(i0.a.k(i0.a.d(0.13f, -16777216, -1), 240));
                        di.d4 d4Var2 = q5Var.H0;
                        d4Var2.U = false;
                        d4Var2.s(LocaleController.getString(R.string.ReactionLongTapHint));
                        q5Var.H0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        q5Var.c1.addView(q5Var.H0, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, q5Var.x2 ? 0.0f : 56.0f, -1, 85));
                    }
                    q5Var.H0.u();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    break;
                }
                break;
            case 2:
                this.b.Q0();
                break;
            case 3:
                ((jb) this.b.Q1).b(true);
                break;
            case 4:
                this.b.r0(true);
                break;
            case 5:
                sb sbVar = this.b.J0;
                if (sbVar != null) {
                    sbVar.H(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 6:
                this.b.O0();
                break;
            case 7:
                q5 q5Var2 = this.b;
                q5Var2.L3 = 0L;
                q3 q3Var = q5Var2.b2;
                if (q3Var != null) {
                    q3Var.I(true);
                    q5Var2.b2.Q1();
                    q5Var2.r0(true);
                    break;
                }
                break;
            case 8:
                q5 q5Var3 = this.b;
                Activity findActivity = AndroidUtilities.findActivity(q5Var3.getContext());
                if (findActivity != null) {
                    a1.f fVar = new a1.f(22, q5Var3, findActivity);
                    sb sbVar2 = ((jb) q5Var3.Q1).d;
                    rb rbVar = sbVar2.z0;
                    if (rbVar != null) {
                        z10 = rbVar.release(fVar);
                        sbVar2.z0 = null;
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
                sb sbVar3 = ((jb) this.b.Q1).d;
                sbVar3.i1 = false;
                sbVar3.P();
                break;
            case 10:
                this.b.L0(null);
                break;
            case 11:
                this.b.c1(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                break;
            default:
                q5 q5Var4 = this.b;
                q5Var4.U3 = true;
                q5Var4.setActive(false);
                break;
        }
    }
}
