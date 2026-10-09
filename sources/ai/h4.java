package ai;

import android.app.Activity;
import android.content.Context;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.yi;
import org.telegram.ui.ok;
import org.telegram.ui.sm;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class h4 extends yi {
    public final /* synthetic */ int S2;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h4(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.n2 n2Var2, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(activity, n2Var2, false, false, true, e6Var);
        this.S2 = i10;
        this.T2 = (NotificationCenter.NotificationCenterDelegate) n2Var;
    }

    @Override // org.telegram.ui.Components.yi, org.telegram.ui.ActionBar.f3
    public void dismissInternal() {
        int i10;
        int i11;
        int i12 = this.S2;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.T2;
        switch (i12) {
            case 1:
                hg.n nVar = (hg.n) notificationCenterDelegate;
                h4 h4Var = nVar.L;
                if (h4Var != null && h4Var.isShowing()) {
                    Activity parentActivity = nVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.n2) nVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                super.dismissInternal();
                break;
            case 2:
                zn znVar = (zn) notificationCenterDelegate;
                h4 h4Var2 = znVar.J1;
                if (h4Var2 != null && (h4Var2.isShowing() || this.x0)) {
                    Activity parentActivity2 = znVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                }
                super.dismissInternal();
                znVar.Y9(false, true);
                sm smVar = znVar.X0;
                if (smVar != null) {
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.y.c(smVar);
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
        ok okVar;
        switch (this.S2) {
            case 0:
                f6 f6Var = (f6) this.T2;
                h4 h4Var = f6Var.I2;
                if (h4Var != null) {
                    h4Var.setFocusable(false);
                }
                b4 b4Var = f6Var.b2;
                if (b4Var != null && b4Var.getEditField() != null) {
                    f6Var.b2.getEditField().requestFocus();
                    break;
                }
                break;
            case 1:
                hg.n nVar = (hg.n) this.T2;
                h4 h4Var2 = nVar.L;
                if (h4Var2 != null) {
                    h4Var2.setFocusable(false);
                }
                h4 h4Var3 = nVar.L;
                if (h4Var3 != null && h4Var3.isShowing()) {
                    Activity parentActivity = nVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.n2) nVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    break;
                }
                break;
            default:
                zn znVar = (zn) this.T2;
                boolean z10 = this.x0;
                boolean M = this.B0.M();
                if (!M) {
                    znVar.D3 = false;
                    ok okVar2 = znVar.Y;
                    if (okVar2 != null) {
                        if (!z10) {
                            okVar2.N();
                        }
                        if (znVar.Y.getEditField() != null) {
                            znVar.Y.getEditField().clearFocus();
                        }
                    }
                }
                if (!z10) {
                    h4 h4Var4 = znVar.J1;
                    if (h4Var4 != null) {
                        h4Var4.setFocusable(false);
                    }
                    if (M && (okVar = znVar.Y) != null && okVar.getEditField() != null) {
                        znVar.Y.getEditField().requestFocus();
                    }
                    h4 h4Var5 = znVar.J1;
                    if (h4Var5 != null && h4Var5.isShowing()) {
                        Activity parentActivity2 = znVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                    }
                    znVar.Y9(false, false);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(f6 f6Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, false, false, true, e6Var);
        this.S2 = 0;
        this.T2 = f6Var;
    }
}
