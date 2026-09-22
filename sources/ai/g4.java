package ai;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.vi;
import org.telegram.ui.bo;
import org.telegram.ui.mk;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class g4 extends vi {
    public final /* synthetic */ int P2;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate Q2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g4(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.n2 n2Var2, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(activity, n2Var2, false, false, true, e6Var);
        this.P2 = i10;
        this.Q2 = (NotificationCenter.NotificationCenterDelegate) n2Var;
    }

    @Override // org.telegram.ui.Components.vi, org.telegram.ui.ActionBar.f3
    public void dismissInternal() {
        int i10;
        int i11;
        switch (this.P2) {
            case 1:
                hg.n nVar = (hg.n) this.Q2;
                g4 g4Var = nVar.L;
                if (g4Var != null && g4Var.isShowing()) {
                    Activity parentActivity = nVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.n2) nVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                super.dismissInternal();
                break;
            case 2:
                bo boVar = (bo) this.Q2;
                g4 g4Var2 = boVar.J1;
                if (g4Var2 != null && g4Var2.isShowing()) {
                    Activity parentActivity2 = boVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) boVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                }
                super.dismissInternal();
                boVar.T9(false, true);
                break;
            default:
                super.dismissInternal();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onDismissAnimationStart() {
        int i10;
        int i11;
        switch (this.P2) {
            case 0:
                f6 f6Var = (f6) this.Q2;
                g4 g4Var = f6Var.I2;
                if (g4Var != null) {
                    g4Var.setFocusable(false);
                }
                a4 a4Var = f6Var.b2;
                if (a4Var != null && a4Var.getEditField() != null) {
                    f6Var.b2.getEditField().requestFocus();
                    break;
                }
                break;
            case 1:
                hg.n nVar = (hg.n) this.Q2;
                g4 g4Var2 = nVar.L;
                if (g4Var2 != null) {
                    g4Var2.setFocusable(false);
                }
                g4 g4Var3 = nVar.L;
                if (g4Var3 != null && g4Var3.isShowing()) {
                    Activity parentActivity = nVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.n2) nVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    break;
                }
                break;
            default:
                bo boVar = (bo) this.Q2;
                g4 g4Var4 = boVar.J1;
                if (g4Var4 != null) {
                    g4Var4.setFocusable(false);
                }
                mk mkVar = boVar.Y;
                if (mkVar != null && mkVar.getEditField() != null) {
                    boVar.Y.getEditField().requestFocus();
                }
                g4 g4Var5 = boVar.J1;
                if (g4Var5 != null && g4Var5.isShowing()) {
                    Activity parentActivity2 = boVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) boVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                }
                boVar.T9(false, false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(f6 f6Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, false, false, true, e6Var);
        this.P2 = 0;
        this.Q2 = f6Var;
    }
}
