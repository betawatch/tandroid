package ci;

import android.app.Activity;
import android.content.Context;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ti;
import org.telegram.ui.fk;
import org.telegram.ui.jm;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                qn qnVar = (qn) notificationCenterDelegate;
                b3 b3Var2 = qnVar.J1;
                if (b3Var2 != null && (b3Var2.isShowing() || this.x0)) {
                    Activity parentActivity2 = qnVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                }
                super.dismissInternal();
                qnVar.Y9(false, true);
                jm jmVar = qnVar.X0;
                if (jmVar != null) {
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.y.c(jmVar);
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
        fk fkVar;
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
                qn qnVar = (qn) this.T2;
                boolean z10 = this.x0;
                boolean M = this.B0.M();
                if (!M) {
                    qnVar.D3 = false;
                    fk fkVar2 = qnVar.Y;
                    if (fkVar2 != null) {
                        if (!z10) {
                            fkVar2.N();
                        }
                        if (qnVar.Y.getEditField() != null) {
                            qnVar.Y.getEditField().clearFocus();
                        }
                    }
                }
                if (!z10) {
                    b3 b3Var4 = qnVar.J1;
                    if (b3Var4 != null) {
                        b3Var4.setFocusable(false);
                    }
                    if (M && (fkVar = qnVar.Y) != null && fkVar.getEditField() != null) {
                        qnVar.Y.getEditField().requestFocus();
                    }
                    b3 b3Var5 = qnVar.J1;
                    if (b3Var5 != null && b3Var5.isShowing()) {
                        Activity parentActivity2 = qnVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                    }
                    qnVar.Y9(false, false);
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
