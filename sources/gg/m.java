package gg;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.yi;
import org.telegram.ui.eo;
import org.telegram.ui.ok;
import zh.a3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class m extends yi {
    public final /* synthetic */ int P2;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate Q2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ m(p2 p2Var, Activity activity, p2 p2Var2, f6 f6Var, int i10) {
        super(activity, p2Var2, false, false, true, f6Var);
        this.P2 = i10;
        this.Q2 = (NotificationCenter.NotificationCenterDelegate) p2Var;
    }

    @Override // org.telegram.ui.Components.yi, org.telegram.ui.ActionBar.h3
    public void dismissInternal() {
        int i10;
        int i11;
        switch (this.P2) {
            case 0:
                n nVar = (n) this.Q2;
                m mVar = nVar.L;
                if (mVar != null && mVar.isShowing()) {
                    Activity parentActivity = nVar.getParentActivity();
                    i10 = ((p2) nVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                super.dismissInternal();
                break;
            case 1:
                eo eoVar = (eo) this.Q2;
                m mVar2 = eoVar.J1;
                if (mVar2 != null && mVar2.isShowing()) {
                    Activity parentActivity2 = eoVar.getParentActivity();
                    i11 = ((p2) eoVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                }
                super.dismissInternal();
                eoVar.T9(false, true);
                break;
            default:
                super.dismissInternal();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onDismissAnimationStart() {
        int i10;
        int i11;
        switch (this.P2) {
            case 0:
                n nVar = (n) this.Q2;
                m mVar = nVar.L;
                if (mVar != null) {
                    mVar.setFocusable(false);
                }
                m mVar2 = nVar.L;
                if (mVar2 != null && mVar2.isShowing()) {
                    Activity parentActivity = nVar.getParentActivity();
                    i10 = ((p2) nVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    break;
                }
                break;
            case 1:
                eo eoVar = (eo) this.Q2;
                m mVar3 = eoVar.J1;
                if (mVar3 != null) {
                    mVar3.setFocusable(false);
                }
                ok okVar = eoVar.Y;
                if (okVar != null && okVar.getEditField() != null) {
                    eoVar.Y.getEditField().requestFocus();
                }
                m mVar4 = eoVar.J1;
                if (mVar4 != null && mVar4.isShowing()) {
                    Activity parentActivity2 = eoVar.getParentActivity();
                    i11 = ((p2) eoVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                }
                eoVar.T9(false, false);
                break;
            default:
                a3 a3Var = (a3) this.Q2;
                m mVar5 = a3Var.I2;
                if (mVar5 != null) {
                    mVar5.setFocusable(false);
                }
                zh.t1 t1Var = a3Var.b2;
                if (t1Var != null && t1Var.getEditField() != null) {
                    a3Var.b2.getEditField().requestFocus();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(a3 a3Var, Context context, f6 f6Var) {
        super(context, null, false, false, true, f6Var);
        this.P2 = 2;
        this.Q2 = a3Var;
    }
}
