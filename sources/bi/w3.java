package bi;

import android.app.Activity;
import android.content.Context;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.vi;
import org.telegram.ui.fo;
import org.telegram.ui.sk;
import org.telegram.ui.xm;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class w3 extends vi {
    public final /* synthetic */ int S2;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ w3(org.telegram.ui.ActionBar.m2 m2Var, Activity activity, org.telegram.ui.ActionBar.m2 m2Var2, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(activity, m2Var2, false, false, true, c6Var);
        this.S2 = i10;
        this.T2 = (NotificationCenter.NotificationCenterDelegate) m2Var;
    }

    @Override // org.telegram.ui.Components.vi, org.telegram.ui.ActionBar.e3
    public void dismissInternal() {
        int i10;
        int i11;
        int i12 = this.S2;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.T2;
        switch (i12) {
            case 1:
                ig.m mVar = (ig.m) notificationCenterDelegate;
                w3 w3Var = mVar.L;
                if (w3Var != null && w3Var.isShowing()) {
                    Activity parentActivity = mVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.m2) mVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                super.dismissInternal();
                break;
            case 2:
                fo foVar = (fo) notificationCenterDelegate;
                w3 w3Var2 = foVar.J1;
                if (w3Var2 != null && (w3Var2.isShowing() || this.x0)) {
                    Activity parentActivity2 = foVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                }
                super.dismissInternal();
                foVar.Y9(false, true);
                xm xmVar = foVar.X0;
                if (xmVar != null) {
                    WeakHashMap weakHashMap = r0.j0.a;
                    r0.z.c(xmVar);
                    break;
                }
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
        sk skVar;
        switch (this.S2) {
            case 0:
                q5 q5Var = (q5) this.T2;
                w3 w3Var = q5Var.I2;
                if (w3Var != null) {
                    w3Var.setFocusable(false);
                }
                q3 q3Var = q5Var.b2;
                if (q3Var != null && q3Var.getEditField() != null) {
                    q5Var.b2.getEditField().requestFocus();
                    break;
                }
                break;
            case 1:
                ig.m mVar = (ig.m) this.T2;
                w3 w3Var2 = mVar.L;
                if (w3Var2 != null) {
                    w3Var2.setFocusable(false);
                }
                w3 w3Var3 = mVar.L;
                if (w3Var3 != null && w3Var3.isShowing()) {
                    Activity parentActivity = mVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.m2) mVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    break;
                }
                break;
            default:
                fo foVar = (fo) this.T2;
                boolean z10 = this.x0;
                boolean M = this.B0.M();
                if (!M) {
                    foVar.D3 = false;
                    sk skVar2 = foVar.Y;
                    if (skVar2 != null) {
                        if (!z10) {
                            skVar2.N();
                        }
                        if (foVar.Y.getEditField() != null) {
                            foVar.Y.getEditField().clearFocus();
                        }
                    }
                }
                if (!z10) {
                    w3 w3Var4 = foVar.J1;
                    if (w3Var4 != null) {
                        w3Var4.setFocusable(false);
                    }
                    if (M && (skVar = foVar.Y) != null && skVar.getEditField() != null) {
                        foVar.Y.getEditField().requestFocus();
                    }
                    w3 w3Var5 = foVar.J1;
                    if (w3Var5 != null && w3Var5.isShowing()) {
                        Activity parentActivity2 = foVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                    }
                    foVar.Y9(false, false);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(q5 q5Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, false, false, true, c6Var);
        this.S2 = 0;
        this.T2 = q5Var;
    }
}
