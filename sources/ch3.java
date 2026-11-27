// default package

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ch3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uj3 b;

    public /* synthetic */ ch3(uj3 uj3Var, byte b) {
        this.a = b;
        this.b = uj3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        uj3 uj3Var = this.b;
        switch (b) {
            case 0:
                uj3Var.fragmentView.dispatchTouchEvent(hl.R());
                break;
            case 1:
                uj3Var.presentFragment(new ThemeActivity(1));
                break;
            case 2:
                uj3Var.getMessagesController().W4(uj3Var.x3(), false);
                break;
            case 3:
                if (LaunchActivity.Q() != null) {
                    uj3Var.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 4:
                tj3[] tj3VarArr = uj3Var.f0;
                if (tj3VarArr != null) {
                    for (tj3 tj3Var : tj3VarArr) {
                        tj3Var.a.requestLayout();
                    }
                }
                uj3Var.o5();
                View view = uj3Var.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 5:
                bj3 bj3Var = uj3Var.D0;
                if (bj3Var == null || !bj3Var.B0) {
                    uj3Var.Y.r.getText().clear();
                    hl.t1(uj3Var.Y.r);
                    uj3Var.Y.r.clearFocus();
                    uj3Var.Z.b(false);
                    break;
                } else {
                    bj3Var.S(false);
                    break;
                }
            case 6:
                if (uj3Var.T0 != 10) {
                    uj3Var.B3(false);
                }
                if (!uj3Var.M || !uj3Var.v3().H()) {
                    uj3Var.R4(true, true);
                    break;
                } else {
                    uj3Var.F0.h();
                    break;
                }
                break;
            case 7:
                z92 z92Var = uj3Var.A1;
                if (z92Var != null) {
                    z92Var.d();
                }
                uj3Var.O2();
                uj3Var.P2();
                di3 di3Var = uj3Var.E1;
                if (di3Var != null) {
                    di3Var.setTranslationY(-uj3Var.w.d());
                    break;
                }
                break;
            case 8:
                uj3Var.w4();
                break;
            case 9:
                uj3Var.U3();
                break;
            case 10:
                uj3Var.getNotificationCenter().k(24, new Object[0]);
                break;
            case 11:
                uj3Var.i3();
                break;
            case 12:
                uj3Var.q5();
                break;
            case 13:
                uj3Var.Q3();
                break;
            case 14:
                uj3Var.L3();
                break;
            case 15:
                uj3Var.getMessagesController().v4(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 16:
                kg5 kg5Var = uj3Var.r0;
                if (kg5Var != null) {
                    kg5Var.f(true);
                }
                uj3Var.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 17:
                uj3Var.f0[0].a.requestLayout();
                li3 li3Var = uj3Var.H3;
                tzb tzbVar = (li3Var == null || !(li3Var.getFragment() instanceof tzb)) ? null : (tzb) uj3Var.H3.getFragment();
                if (tzbVar != null) {
                    tzbVar.C0();
                }
                uj3Var.c3(false);
                uj3Var.o5();
                bj3 bj3Var2 = uj3Var.D0;
                if (bj3Var2 != null) {
                    bj3Var2.invalidate();
                    break;
                }
                break;
            case 18:
                uj3Var.y5();
                break;
            default:
                v21.e();
                uj3Var.presentFragment(new SessionsActivity(0));
                break;
        }
    }
}
