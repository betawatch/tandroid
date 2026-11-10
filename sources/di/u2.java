package di;

import android.app.Activity;
import android.content.Context;
import java.util.WeakHashMap;
import org.telegram.ui.Components.ci;
import org.telegram.ui.cn;
import org.telegram.ui.ql;
import org.telegram.ui.sj;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class u2 extends ci {
    public final /* synthetic */ int I4;
    public final /* synthetic */ Object J4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2(org.telegram.ui.ActionBar.f2 f2Var, Activity activity, org.telegram.ui.ActionBar.f2 f2Var2, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(activity, f2Var2, false, false, true, h6Var);
        this.I4 = i7;
        this.J4 = f2Var;
    }

    @Override // org.telegram.ui.Components.ci, org.telegram.ui.ActionBar.w2
    public void K() {
        int i7;
        int i10;
        int i11 = this.I4;
        Object obj = this.J4;
        switch (i11) {
            case 1:
                kg.m mVar = (kg.m) obj;
                u2 u2Var = mVar.L;
                if (u2Var != null && u2Var.isShowing()) {
                    Activity parentActivity = mVar.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.f2) mVar).classGuid;
                    org.telegram.messenger.g0.a3(parentActivity, i7);
                }
                super.K();
                break;
            case 2:
                cn cnVar = (cn) obj;
                u2 u2Var2 = cnVar.X1;
                if (u2Var2 != null && (u2Var2.isShowing() || this.r2)) {
                    Activity parentActivity2 = cnVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
                    org.telegram.messenger.g0.a3(parentActivity2, i10);
                }
                super.K();
                cnVar.va(false, true);
                ql qlVar = cnVar.l1;
                if (qlVar != null) {
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.y.c(qlVar);
                    break;
                }
                break;
            case 3:
                super.K();
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                super.K();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public void n0() {
        int i7;
        int i10;
        sj sjVar;
        int i11 = this.I4;
        Object obj = this.J4;
        switch (i11) {
            case 0:
                j4 j4Var = (j4) obj;
                u2 u2Var = j4Var.r2;
                if (u2Var != null) {
                    u2Var.A0(false);
                }
                o2 o2Var = j4Var.K1;
                if (o2Var != null && o2Var.getEditField() != null) {
                    j4Var.K1.getEditField().requestFocus();
                    break;
                }
                break;
            case 1:
                kg.m mVar = (kg.m) obj;
                u2 u2Var2 = mVar.L;
                if (u2Var2 != null) {
                    u2Var2.A0(false);
                }
                u2 u2Var3 = mVar.L;
                if (u2Var3 != null && u2Var3.isShowing()) {
                    Activity parentActivity = mVar.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.f2) mVar).classGuid;
                    org.telegram.messenger.g0.a3(parentActivity, i7);
                    break;
                }
                break;
            case 2:
                cn cnVar = (cn) obj;
                boolean z9 = this.r2;
                boolean N = this.v2.N();
                if (!N) {
                    cnVar.R3 = false;
                    sj sjVar2 = cnVar.Z;
                    if (sjVar2 != null) {
                        if (!z9) {
                            sjVar2.L();
                        }
                        if (cnVar.Z.getEditField() != null) {
                            cnVar.Z.getEditField().clearFocus();
                        }
                    }
                }
                if (!z9) {
                    u2 u2Var4 = cnVar.X1;
                    if (u2Var4 != null) {
                        u2Var4.A0(false);
                    }
                    if (N && (sjVar = cnVar.Z) != null && sjVar.getEditField() != null) {
                        cnVar.Z.getEditField().requestFocus();
                    }
                    u2 u2Var5 = cnVar.X1;
                    if (u2Var5 != null && u2Var5.isShowing()) {
                        Activity parentActivity2 = cnVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
                        org.telegram.messenger.g0.a3(parentActivity2, i10);
                    }
                    cnVar.va(false, false);
                    ql qlVar = cnVar.l1;
                    if (qlVar != null) {
                        WeakHashMap weakHashMap = r0.i0.a;
                        r0.y.c(qlVar);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(Context context, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.h6 h6Var, Runnable runnable) {
        super(context, f2Var, false, false, true, h6Var);
        this.I4 = 3;
        this.J4 = runnable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(j4 j4Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, false, false, true, h6Var);
        this.I4 = 0;
        this.J4 = j4Var;
    }
}
