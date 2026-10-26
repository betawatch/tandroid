package di;

import android.app.Activity;
import android.content.Context;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ti;
import org.telegram.ui.hk;
import org.telegram.ui.mm;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class a3 extends ti {
    public final /* synthetic */ int O2;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate P2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a3(org.telegram.ui.ActionBar.r2 r2Var, Activity activity, org.telegram.ui.ActionBar.r2 r2Var2, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(activity, r2Var2, false, false, true, u6Var);
        this.O2 = i10;
        this.P2 = (NotificationCenter.NotificationCenterDelegate) r2Var;
    }

    @Override // org.telegram.ui.Components.ti, org.telegram.ui.ActionBar.k3
    public void dismissInternal() {
        int i10;
        int i11;
        int i12 = this.O2;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.P2;
        switch (i12) {
            case 1:
                jg.n nVar = (jg.n) notificationCenterDelegate;
                a3 a3Var = nVar.L;
                if (a3Var != null && a3Var.isShowing()) {
                    Activity parentActivity = nVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.r2) nVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                super.dismissInternal();
                break;
            case 2:
                un unVar = (un) notificationCenterDelegate;
                a3 a3Var2 = unVar.V1;
                if (a3Var2 != null && (a3Var2.isShowing() || this.x0)) {
                    Activity parentActivity2 = unVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                }
                super.dismissInternal();
                unVar.da(false, true);
                mm mmVar = unVar.j1;
                if (mmVar != null) {
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.y.c(mmVar);
                    break;
                }
                break;
            default:
                super.dismissInternal();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onDismissAnimationStart() {
        int i10;
        int i11;
        hk hkVar;
        int i12 = this.O2;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.P2;
        switch (i12) {
            case 0:
                q4 q4Var = (q4) notificationCenterDelegate;
                a3 a3Var = q4Var.x2;
                if (a3Var != null) {
                    a3Var.setFocusable(false);
                }
                u2 u2Var = q4Var.Q1;
                if (u2Var != null && u2Var.getEditField() != null) {
                    q4Var.Q1.getEditField().requestFocus();
                    break;
                }
                break;
            case 1:
                jg.n nVar = (jg.n) notificationCenterDelegate;
                a3 a3Var2 = nVar.L;
                if (a3Var2 != null) {
                    a3Var2.setFocusable(false);
                }
                a3 a3Var3 = nVar.L;
                if (a3Var3 != null && a3Var3.isShowing()) {
                    Activity parentActivity = nVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.r2) nVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    break;
                }
                break;
            default:
                un unVar = (un) notificationCenterDelegate;
                boolean z10 = this.x0;
                boolean M = this.B0.M();
                if (!M) {
                    unVar.P3 = false;
                    hk hkVar2 = unVar.Y;
                    if (hkVar2 != null) {
                        if (!z10) {
                            hkVar2.M();
                        }
                        if (unVar.Y.getEditField() != null) {
                            unVar.Y.getEditField().clearFocus();
                        }
                    }
                }
                if (!z10) {
                    a3 a3Var4 = unVar.V1;
                    if (a3Var4 != null) {
                        a3Var4.setFocusable(false);
                    }
                    if (M && (hkVar = unVar.Y) != null && hkVar.getEditField() != null) {
                        unVar.Y.getEditField().requestFocus();
                    }
                    a3 a3Var5 = unVar.V1;
                    if (a3Var5 != null && a3Var5.isShowing()) {
                        Activity parentActivity2 = unVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                    }
                    unVar.da(false, false);
                    mm mmVar = unVar.j1;
                    if (mmVar != null) {
                        WeakHashMap weakHashMap = r0.i0.a;
                        r0.y.c(mmVar);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(q4 q4Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null, false, false, true, u6Var);
        this.O2 = 0;
        this.P2 = q4Var;
    }
}
