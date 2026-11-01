package ag;

import android.app.Activity;
import android.content.Context;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.bi;
import org.telegram.ui.km;
import org.telegram.ui.mk;
import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class v extends bi {
    public final /* synthetic */ int F4;
    public final /* synthetic */ Object G4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(org.telegram.ui.ActionBar.k2 k2Var, Activity activity, org.telegram.ui.ActionBar.k2 k2Var2, p6 p6Var, int i10) {
        super(activity, k2Var2, false, false, true, p6Var);
        this.F4 = i10;
        this.G4 = k2Var;
    }

    @Override // org.telegram.ui.Components.bi, org.telegram.ui.ActionBar.z2
    public void L() {
        int i10;
        int i11;
        int i12 = this.F4;
        Object obj = this.G4;
        switch (i12) {
            case 0:
                w wVar = (w) obj;
                v vVar = wVar.L;
                if (vVar != null && vVar.isShowing()) {
                    Activity parentActivity = wVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.k2) wVar).classGuid;
                    org.telegram.messenger.i0.Z2(parentActivity, i10);
                }
                super.L();
                break;
            case 1:
                un unVar = (un) obj;
                v vVar2 = unVar.X1;
                if (vVar2 != null && (vVar2.isShowing() || this.o2)) {
                    Activity parentActivity2 = unVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
                    org.telegram.messenger.i0.Z2(parentActivity2, i11);
                }
                super.L();
                unVar.oa(false, true);
                km kmVar = unVar.l1;
                if (kmVar != null) {
                    WeakHashMap weakHashMap = r0.h0.a;
                    r0.x.c(kmVar);
                    break;
                }
                break;
            case 2:
                super.L();
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                super.L();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public void n0() {
        int i10;
        int i11;
        mk mkVar;
        int i12 = this.F4;
        Object obj = this.G4;
        switch (i12) {
            case 0:
                w wVar = (w) obj;
                v vVar = wVar.L;
                if (vVar != null) {
                    vVar.A0(false);
                }
                v vVar2 = wVar.L;
                if (vVar2 != null && vVar2.isShowing()) {
                    Activity parentActivity = wVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.k2) wVar).classGuid;
                    org.telegram.messenger.i0.Z2(parentActivity, i10);
                    break;
                }
                break;
            case 1:
                un unVar = (un) obj;
                boolean z10 = this.o2;
                boolean M = this.s2.M();
                if (!M) {
                    unVar.R3 = false;
                    mk mkVar2 = unVar.Z;
                    if (mkVar2 != null) {
                        if (!z10) {
                            mkVar2.K();
                        }
                        if (unVar.Z.getEditField() != null) {
                            unVar.Z.getEditField().clearFocus();
                        }
                    }
                }
                if (!z10) {
                    v vVar3 = unVar.X1;
                    if (vVar3 != null) {
                        vVar3.A0(false);
                    }
                    if (M && (mkVar = unVar.Z) != null && mkVar.getEditField() != null) {
                        unVar.Z.getEditField().requestFocus();
                    }
                    v vVar4 = unVar.X1;
                    if (vVar4 != null && vVar4.isShowing()) {
                        Activity parentActivity2 = unVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
                        org.telegram.messenger.i0.Z2(parentActivity2, i11);
                    }
                    unVar.oa(false, false);
                    km kmVar = unVar.l1;
                    if (kmVar != null) {
                        WeakHashMap weakHashMap = r0.h0.a;
                        r0.x.c(kmVar);
                        break;
                    }
                }
                break;
            case 3:
                th.z2 z2Var = (th.z2) obj;
                v vVar5 = z2Var.r2;
                if (vVar5 != null) {
                    vVar5.A0(false);
                }
                th.t1 t1Var = z2Var.K1;
                if (t1Var != null && t1Var.getEditField() != null) {
                    z2Var.K1.getEditField().requestFocus();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, org.telegram.ui.ActionBar.k2 k2Var, p6 p6Var, Runnable runnable) {
        super(context, k2Var, false, false, true, p6Var);
        this.F4 = 2;
        this.G4 = runnable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(th.z2 z2Var, Context context, p6 p6Var) {
        super(context, null, false, false, true, p6Var);
        this.F4 = 3;
        this.G4 = z2Var;
    }
}
