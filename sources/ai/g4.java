package ai;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.xi;
import org.telegram.ui.jk;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class g4 extends xi {
    public final /* synthetic */ int I2;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate J2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g4(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.n2 n2Var2, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(activity, n2Var2, false, false, true, d6Var);
        this.I2 = i10;
        this.J2 = (NotificationCenter.NotificationCenterDelegate) n2Var;
    }

    @Override // org.telegram.ui.Components.xi, org.telegram.ui.ActionBar.f3
    public void dismissInternal() {
        int i10;
        int i11;
        switch (this.I2) {
            case 1:
                hg.n nVar = (hg.n) this.J2;
                g4 g4Var = nVar.M;
                if (g4Var != null && g4Var.isShowing()) {
                    Activity parentActivity = nVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.n2) nVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                super.dismissInternal();
                break;
            case 2:
                yn ynVar = (yn) this.J2;
                g4 g4Var2 = ynVar.H1;
                if (g4Var2 != null && g4Var2.isShowing()) {
                    Activity parentActivity2 = ynVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                }
                super.dismissInternal();
                ynVar.S9(false, true);
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
        switch (this.I2) {
            case 0:
                e6 e6Var = (e6) this.J2;
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
                hg.n nVar = (hg.n) this.J2;
                g4 g4Var2 = nVar.M;
                if (g4Var2 != null) {
                    g4Var2.setFocusable(false);
                }
                g4 g4Var3 = nVar.M;
                if (g4Var3 != null && g4Var3.isShowing()) {
                    Activity parentActivity = nVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.n2) nVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    break;
                }
                break;
            default:
                yn ynVar = (yn) this.J2;
                g4 g4Var4 = ynVar.H1;
                if (g4Var4 != null) {
                    g4Var4.setFocusable(false);
                }
                jk jkVar = ynVar.W;
                if (jkVar != null && jkVar.getEditField() != null) {
                    ynVar.W.getEditField().requestFocus();
                }
                g4 g4Var5 = ynVar.H1;
                if (g4Var5 != null && g4Var5.isShowing()) {
                    Activity parentActivity2 = ynVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                }
                ynVar.S9(false, false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(e6 e6Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, false, false, true, d6Var);
        this.I2 = 0;
        this.J2 = e6Var;
    }
}
