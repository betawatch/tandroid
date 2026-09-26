package ai;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.wi;
import org.telegram.ui.jk;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class g4 extends wi {
    public final /* synthetic */ int P2;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate Q2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g4(org.telegram.ui.ActionBar.m2 m2Var, Activity activity, org.telegram.ui.ActionBar.m2 m2Var2, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(activity, m2Var2, false, false, true, d6Var);
        this.P2 = i10;
        this.Q2 = (NotificationCenter.NotificationCenterDelegate) m2Var;
    }

    @Override // org.telegram.ui.Components.wi, org.telegram.ui.ActionBar.e3
    public void dismissInternal() {
        int i10;
        int i11;
        switch (this.P2) {
            case 1:
                hg.n nVar = (hg.n) this.Q2;
                g4 g4Var = nVar.L;
                if (g4Var != null && g4Var.isShowing()) {
                    Activity parentActivity = nVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.m2) nVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                super.dismissInternal();
                break;
            case 2:
                wn wnVar = (wn) this.Q2;
                g4 g4Var2 = wnVar.J1;
                if (g4Var2 != null && g4Var2.isShowing()) {
                    Activity parentActivity2 = wnVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                }
                super.dismissInternal();
                wnVar.T9(false, true);
                break;
            default:
                super.dismissInternal();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onDismissAnimationStart() {
        int i10;
        int i11;
        switch (this.P2) {
            case 0:
                e6 e6Var = (e6) this.Q2;
                g4 g4Var = e6Var.I2;
                if (g4Var != null) {
                    g4Var.setFocusable(false);
                }
                a4 a4Var = e6Var.b2;
                if (a4Var != null && a4Var.getEditField() != null) {
                    e6Var.b2.getEditField().requestFocus();
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
                    i10 = ((org.telegram.ui.ActionBar.m2) nVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    break;
                }
                break;
            default:
                wn wnVar = (wn) this.Q2;
                g4 g4Var4 = wnVar.J1;
                if (g4Var4 != null) {
                    g4Var4.setFocusable(false);
                }
                jk jkVar = wnVar.Y;
                if (jkVar != null && jkVar.getEditField() != null) {
                    wnVar.Y.getEditField().requestFocus();
                }
                g4 g4Var5 = wnVar.J1;
                if (g4Var5 != null && g4Var5.isShowing()) {
                    Activity parentActivity2 = wnVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                }
                wnVar.T9(false, false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(e6 e6Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, false, false, true, d6Var);
        this.P2 = 0;
        this.Q2 = e6Var;
    }
}
