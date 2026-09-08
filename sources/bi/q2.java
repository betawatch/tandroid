package bi;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class q2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    public /* synthetic */ q2(o5 o5Var, int i10) {
        this.a = i10;
        this.b = o5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                this.b.j2.setVisibility(8);
                break;
            case 1:
                o5 o5Var = this.b;
                if (!o5Var.J0.H0) {
                    o5Var.z3 = null;
                    if (o5Var.H0 == null) {
                        di.f4 f4Var = new di.f4(o5Var.getContext(), 3);
                        f4Var.l(1.0f, -22.0f);
                        o5Var.H0 = f4Var;
                        f4Var.h(i0.a.k(i0.a.d(0.13f, -16777216, -1), 240));
                        di.f4 f4Var2 = o5Var.H0;
                        f4Var2.U = false;
                        f4Var2.s(LocaleController.getString(R.string.ReactionLongTapHint));
                        o5Var.H0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        o5Var.c1.addView(o5Var.H0, w7.x5.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, o5Var.x2 ? 0.0f : 56.0f));
                    }
                    o5Var.H0.u();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    break;
                }
                break;
            case 2:
                this.b.Q0();
                break;
            case 3:
                ((gb) this.b.Q1).b(true);
                break;
            case 4:
                this.b.r0(true);
                break;
            case 5:
                pb pbVar = this.b.J0;
                if (pbVar != null) {
                    pbVar.H(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 6:
                this.b.O0();
                break;
            case 7:
                o5 o5Var2 = this.b;
                o5Var2.L3 = 0L;
                n3 n3Var = o5Var2.b2;
                if (n3Var != null) {
                    n3Var.K(true);
                    o5Var2.b2.R1();
                    o5Var2.r0(true);
                    break;
                }
                break;
            case 8:
                o5 o5Var3 = this.b;
                Activity findActivity = AndroidUtilities.findActivity(o5Var3.getContext());
                if (findActivity != null) {
                    a1.e eVar = new a1.e(20, o5Var3, findActivity);
                    pb pbVar2 = ((gb) o5Var3.Q1).d;
                    ob obVar = pbVar2.z0;
                    if (obVar != null) {
                        z10 = obVar.release(eVar);
                        pbVar2.z0 = null;
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
                pb pbVar3 = ((gb) this.b.Q1).d;
                pbVar3.i1 = false;
                pbVar3.P();
                break;
            case 10:
                this.b.L0(null);
                break;
            case 11:
                this.b.c1(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                break;
            default:
                o5 o5Var4 = this.b;
                o5Var4.U3 = true;
                o5Var4.setActive(false);
                break;
        }
    }
}
