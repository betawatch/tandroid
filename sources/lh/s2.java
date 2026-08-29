package lh;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ni;
import org.telegram.ui.dk;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class s2 extends ni {
    public final /* synthetic */ int L2;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate M2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ s2(org.telegram.ui.ActionBar.o2 o2Var, Activity activity, org.telegram.ui.ActionBar.o2 o2Var2, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(activity, o2Var2, false, false, true, c6Var);
        this.L2 = i10;
        this.M2 = (NotificationCenter.NotificationCenterDelegate) o2Var;
    }

    @Override // org.telegram.ui.Components.ni, org.telegram.ui.ActionBar.f3
    public void dismissInternal() {
        int i10;
        int i11;
        switch (this.L2) {
            case 1:
                tn tnVar = (tn) this.M2;
                s2 s2Var = tnVar.F1;
                if (s2Var != null && s2Var.isShowing()) {
                    Activity parentActivity = tnVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                super.dismissInternal();
                tnVar.T9(false, true);
                break;
            case 2:
                sf.l lVar = (sf.l) this.M2;
                s2 s2Var2 = lVar.H;
                if (s2Var2 != null && s2Var2.isShowing()) {
                    Activity parentActivity2 = lVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.o2) lVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                }
                super.dismissInternal();
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
        switch (this.L2) {
            case 0:
                d4 d4Var = (d4) this.M2;
                s2 s2Var = d4Var.E2;
                if (s2Var != null) {
                    s2Var.setFocusable(false);
                }
                n2 n2Var = d4Var.X1;
                if (n2Var != null && n2Var.getEditField() != null) {
                    d4Var.X1.getEditField().requestFocus();
                    break;
                }
                break;
            case 1:
                tn tnVar = (tn) this.M2;
                s2 s2Var2 = tnVar.F1;
                if (s2Var2 != null) {
                    s2Var2.setFocusable(false);
                }
                dk dkVar = tnVar.U;
                if (dkVar != null && dkVar.getEditField() != null) {
                    tnVar.U.getEditField().requestFocus();
                }
                s2 s2Var3 = tnVar.F1;
                if (s2Var3 != null && s2Var3.isShowing()) {
                    Activity parentActivity = tnVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                tnVar.T9(false, false);
                break;
            default:
                sf.l lVar = (sf.l) this.M2;
                s2 s2Var4 = lVar.H;
                if (s2Var4 != null) {
                    s2Var4.setFocusable(false);
                }
                s2 s2Var5 = lVar.H;
                if (s2Var5 != null && s2Var5.isShowing()) {
                    Activity parentActivity2 = lVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.o2) lVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(d4 d4Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, false, false, true, c6Var);
        this.L2 = 0;
        this.M2 = d4Var;
    }
}
