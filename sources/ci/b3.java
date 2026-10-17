package ci;

import android.app.Activity;
import android.content.Context;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ti;
import org.telegram.ui.hk;
import org.telegram.ui.lm;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class b3 extends ti {
    public final /* synthetic */ int S2;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b3(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.n2 n2Var2, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(activity, n2Var2, false, false, true, d6Var);
        this.S2 = i10;
        this.T2 = (NotificationCenter.NotificationCenterDelegate) n2Var;
    }

    @Override // org.telegram.ui.Components.ti, org.telegram.ui.ActionBar.f3
    public void dismissInternal() {
        int i10;
        int i11;
        int i12 = this.S2;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.T2;
        switch (i12) {
            case 1:
                ig.m mVar = (ig.m) notificationCenterDelegate;
                b3 b3Var = mVar.L;
                if (b3Var != null && b3Var.isShowing()) {
                    Activity parentActivity = mVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.n2) mVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                super.dismissInternal();
                break;
            case 2:
                sn snVar = (sn) notificationCenterDelegate;
                b3 b3Var2 = snVar.J1;
                if (b3Var2 != null && (b3Var2.isShowing() || this.x0)) {
                    Activity parentActivity2 = snVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) snVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                }
                super.dismissInternal();
                snVar.Y9(false, true);
                lm lmVar = snVar.X0;
                if (lmVar != null) {
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.y.c(lmVar);
                    break;
                }
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
        hk hkVar;
        switch (this.S2) {
            case 0:
                q4 q4Var = (q4) this.T2;
                b3 b3Var = q4Var.I2;
                if (b3Var != null) {
                    b3Var.setFocusable(false);
                }
                v2 v2Var = q4Var.b2;
                if (v2Var != null && v2Var.getEditField() != null) {
                    q4Var.b2.getEditField().requestFocus();
                    break;
                }
                break;
            case 1:
                ig.m mVar = (ig.m) this.T2;
                b3 b3Var2 = mVar.L;
                if (b3Var2 != null) {
                    b3Var2.setFocusable(false);
                }
                b3 b3Var3 = mVar.L;
                if (b3Var3 != null && b3Var3.isShowing()) {
                    Activity parentActivity = mVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.n2) mVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    break;
                }
                break;
            default:
                sn snVar = (sn) this.T2;
                boolean z10 = this.x0;
                boolean M = this.B0.M();
                if (!M) {
                    snVar.D3 = false;
                    hk hkVar2 = snVar.Y;
                    if (hkVar2 != null) {
                        if (!z10) {
                            hkVar2.N();
                        }
                        if (snVar.Y.getEditField() != null) {
                            snVar.Y.getEditField().clearFocus();
                        }
                    }
                }
                if (!z10) {
                    b3 b3Var4 = snVar.J1;
                    if (b3Var4 != null) {
                        b3Var4.setFocusable(false);
                    }
                    if (M && (hkVar = snVar.Y) != null && hkVar.getEditField() != null) {
                        snVar.Y.getEditField().requestFocus();
                    }
                    b3 b3Var5 = snVar.J1;
                    if (b3Var5 != null && b3Var5.isShowing()) {
                        Activity parentActivity2 = snVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.n2) snVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                    }
                    snVar.Y9(false, false);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(q4 q4Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, false, false, true, d6Var);
        this.S2 = 0;
        this.T2 = q4Var;
    }
}
