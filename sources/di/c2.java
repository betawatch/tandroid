package di;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q4 b;

    public /* synthetic */ c2(q4 q4Var, int i10) {
        this.a = i10;
        this.b = q4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                this.b.Y1.setVisibility(8);
                break;
            case 1:
                q4 q4Var = this.b;
                if (!q4Var.y0.H0) {
                    q4Var.o3 = null;
                    if (q4Var.w0 == null) {
                        fi.v3 v3Var = new fi.v3(q4Var.getContext(), 3);
                        v3Var.l(1.0f, -22.0f);
                        q4Var.w0 = v3Var;
                        v3Var.h(i0.a.o(i0.a.f(0.13f, -16777216, -1), 240));
                        fi.v3 v3Var2 = q4Var.w0;
                        v3Var2.U = false;
                        v3Var2.s(LocaleController.getString(R.string.ReactionLongTapHint));
                        q4Var.w0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        q4Var.R0.addView(q4Var.w0, kb1.h(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, q4Var.m2 ? 0.0f : 56.0f));
                    }
                    q4Var.w0.u();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    break;
                }
                break;
            case 2:
                this.b.O0();
                break;
            case 3:
                ((p9) this.b.F1).b(true);
                break;
            case 4:
                this.b.p0(true);
                break;
            case 5:
                y9 y9Var = this.b.y0;
                if (y9Var != null) {
                    y9Var.I(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 6:
                this.b.M0();
                break;
            case 7:
                q4 q4Var2 = this.b;
                q4Var2.A3 = 0L;
                u2 u2Var = q4Var2.Q1;
                if (u2Var != null) {
                    u2Var.F(true);
                    q4Var2.Q1.O1();
                    q4Var2.p0(true);
                    break;
                }
                break;
            case 8:
                q4 q4Var3 = this.b;
                Activity findActivity = AndroidUtilities.findActivity(q4Var3.getContext());
                if (findActivity != null) {
                    bi.f2 f2Var = new bi.f2(29, q4Var3, findActivity);
                    y9 y9Var2 = ((p9) q4Var3.F1).d;
                    x9 x9Var = y9Var2.z0;
                    if (x9Var != null) {
                        z10 = x9Var.release(f2Var);
                        y9Var2.z0 = null;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        AndroidUtilities.runOnUIThread(f2Var, 80L);
                        break;
                    }
                }
                break;
            case 9:
                y9 y9Var3 = ((p9) this.b.F1).d;
                y9Var3.i1 = false;
                y9Var3.Q();
                break;
            case 10:
                this.b.J0(null);
                break;
            case 11:
                this.b.a1(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                break;
            default:
                q4 q4Var4 = this.b;
                q4Var4.J3 = true;
                q4Var4.setActive(false);
                break;
        }
    }
}
