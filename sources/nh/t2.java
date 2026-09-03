package nh;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.li;
import org.telegram.ui.lk;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class t2 extends li {
    public final /* synthetic */ int M2;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate N2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ t2(org.telegram.ui.ActionBar.p2 p2Var, Activity activity, org.telegram.ui.ActionBar.p2 p2Var2, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(activity, p2Var2, false, false, true, f6Var);
        this.M2 = i10;
        this.N2 = (NotificationCenter.NotificationCenterDelegate) p2Var;
    }

    @Override // org.telegram.ui.Components.li, org.telegram.ui.ActionBar.g3
    public void dismissInternal() {
        int i10;
        int i11;
        switch (this.M2) {
            case 1:
                zn znVar = (zn) this.N2;
                t2 t2Var = znVar.G1;
                if (t2Var != null && t2Var.isShowing()) {
                    Activity parentActivity = znVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                super.dismissInternal();
                znVar.T9(false, true);
                break;
            case 2:
                uf.k kVar = (uf.k) this.N2;
                t2 t2Var2 = kVar.I;
                if (t2Var2 != null && t2Var2.isShowing()) {
                    Activity parentActivity2 = kVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.p2) kVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                }
                super.dismissInternal();
                break;
            default:
                super.dismissInternal();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onDismissAnimationStart() {
        int i10;
        int i11;
        switch (this.M2) {
            case 0:
                d4 d4Var = (d4) this.N2;
                t2 t2Var = d4Var.F2;
                if (t2Var != null) {
                    t2Var.setFocusable(false);
                }
                o2 o2Var = d4Var.Y1;
                if (o2Var != null && o2Var.getEditField() != null) {
                    d4Var.Y1.getEditField().requestFocus();
                    break;
                }
                break;
            case 1:
                zn znVar = (zn) this.N2;
                t2 t2Var2 = znVar.G1;
                if (t2Var2 != null) {
                    t2Var2.setFocusable(false);
                }
                lk lkVar = znVar.V;
                if (lkVar != null && lkVar.getEditField() != null) {
                    znVar.V.getEditField().requestFocus();
                }
                t2 t2Var3 = znVar.G1;
                if (t2Var3 != null && t2Var3.isShowing()) {
                    Activity parentActivity = znVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                znVar.T9(false, false);
                break;
            default:
                uf.k kVar = (uf.k) this.N2;
                t2 t2Var4 = kVar.I;
                if (t2Var4 != null) {
                    t2Var4.setFocusable(false);
                }
                t2 t2Var5 = kVar.I;
                if (t2Var5 != null && t2Var5.isShowing()) {
                    Activity parentActivity2 = kVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.p2) kVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(d4 d4Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, true, f6Var);
        this.M2 = 0;
        this.N2 = d4Var;
    }
}
