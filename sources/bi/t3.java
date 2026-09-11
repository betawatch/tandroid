package bi;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.vi;
import org.telegram.ui.co;
import org.telegram.ui.mk;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class t3 extends vi {
    public final /* synthetic */ int P2;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate Q2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ t3(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.n2 n2Var2, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(activity, n2Var2, false, false, true, f6Var);
        this.P2 = i10;
        this.Q2 = (NotificationCenter.NotificationCenterDelegate) n2Var;
    }

    @Override // org.telegram.ui.Components.vi, org.telegram.ui.ActionBar.f3
    public void dismissInternal() {
        int i10;
        int i11;
        switch (this.P2) {
            case 1:
                ig.m mVar = (ig.m) this.Q2;
                t3 t3Var = mVar.L;
                if (t3Var != null && t3Var.isShowing()) {
                    Activity parentActivity = mVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.n2) mVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                super.dismissInternal();
                break;
            case 2:
                co coVar = (co) this.Q2;
                t3 t3Var2 = coVar.J1;
                if (t3Var2 != null && t3Var2.isShowing()) {
                    Activity parentActivity2 = coVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                }
                super.dismissInternal();
                coVar.T9(false, true);
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
                o5 o5Var = (o5) this.Q2;
                t3 t3Var = o5Var.I2;
                if (t3Var != null) {
                    t3Var.setFocusable(false);
                }
                n3 n3Var = o5Var.b2;
                if (n3Var != null && n3Var.getEditField() != null) {
                    o5Var.b2.getEditField().requestFocus();
                    break;
                }
                break;
            case 1:
                ig.m mVar = (ig.m) this.Q2;
                t3 t3Var2 = mVar.L;
                if (t3Var2 != null) {
                    t3Var2.setFocusable(false);
                }
                t3 t3Var3 = mVar.L;
                if (t3Var3 != null && t3Var3.isShowing()) {
                    Activity parentActivity = mVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.n2) mVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    break;
                }
                break;
            default:
                co coVar = (co) this.Q2;
                t3 t3Var4 = coVar.J1;
                if (t3Var4 != null) {
                    t3Var4.setFocusable(false);
                }
                mk mkVar = coVar.Y;
                if (mkVar != null && mkVar.getEditField() != null) {
                    coVar.Y.getEditField().requestFocus();
                }
                t3 t3Var5 = coVar.J1;
                if (t3Var5 != null && t3Var5.isShowing()) {
                    Activity parentActivity2 = coVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                }
                coVar.T9(false, false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(o5 o5Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, true, f6Var);
        this.P2 = 0;
        this.Q2 = o5Var;
    }
}
