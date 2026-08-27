package jh;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.gi;
import org.telegram.ui.ck;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class t2 extends gi {
    public final /* synthetic */ int L2;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate M2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ t2(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.n2 n2Var2, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(activity, n2Var2, false, false, true, c6Var);
        this.L2 = i10;
        this.M2 = (NotificationCenter.NotificationCenterDelegate) n2Var;
    }

    @Override // org.telegram.ui.Components.gi, org.telegram.ui.ActionBar.e3
    public void dismissInternal() {
        int i10;
        int i11;
        switch (this.L2) {
            case 1:
                rn rnVar = (rn) this.M2;
                t2 t2Var = rnVar.F1;
                if (t2Var != null && t2Var.isShowing()) {
                    Activity parentActivity = rnVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.n2) rnVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                super.dismissInternal();
                rnVar.T9(false, true);
                break;
            case 2:
                qf.m mVar = (qf.m) this.M2;
                t2 t2Var2 = mVar.H;
                if (t2Var2 != null && t2Var2.isShowing()) {
                    Activity parentActivity2 = mVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) mVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                }
                super.dismissInternal();
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
        switch (this.L2) {
            case 0:
                e4 e4Var = (e4) this.M2;
                t2 t2Var = e4Var.E2;
                if (t2Var != null) {
                    t2Var.setFocusable(false);
                }
                o2 o2Var = e4Var.X1;
                if (o2Var != null && o2Var.getEditField() != null) {
                    e4Var.X1.getEditField().requestFocus();
                    break;
                }
                break;
            case 1:
                rn rnVar = (rn) this.M2;
                t2 t2Var2 = rnVar.F1;
                if (t2Var2 != null) {
                    t2Var2.setFocusable(false);
                }
                ck ckVar = rnVar.U;
                if (ckVar != null && ckVar.getEditField() != null) {
                    rnVar.U.getEditField().requestFocus();
                }
                t2 t2Var3 = rnVar.F1;
                if (t2Var3 != null && t2Var3.isShowing()) {
                    Activity parentActivity = rnVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.n2) rnVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                rnVar.T9(false, false);
                break;
            default:
                qf.m mVar = (qf.m) this.M2;
                t2 t2Var4 = mVar.H;
                if (t2Var4 != null) {
                    t2Var4.setFocusable(false);
                }
                t2 t2Var5 = mVar.H;
                if (t2Var5 != null && t2Var5.isShowing()) {
                    Activity parentActivity2 = mVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) mVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(e4 e4Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, false, false, true, c6Var);
        this.L2 = 0;
        this.M2 = e4Var;
    }
}
