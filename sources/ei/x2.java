package ei;

import android.app.Activity;
import android.content.Context;
import java.util.WeakHashMap;
import org.telegram.ui.Components.bi;
import org.telegram.ui.kl;
import org.telegram.ui.mj;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x2 extends bi {
    public final /* synthetic */ int G4;
    public final /* synthetic */ Object H4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(org.telegram.ui.ActionBar.d2 d2Var, Activity activity, org.telegram.ui.ActionBar.d2 d2Var2, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(activity, d2Var2, false, false, true, e6Var);
        this.G4 = i3;
        this.H4 = d2Var;
    }

    @Override // org.telegram.ui.Components.bi, org.telegram.ui.ActionBar.t2
    public void K() {
        int i3;
        int i10;
        int i11 = this.G4;
        Object obj = this.H4;
        switch (i11) {
            case 1:
                lg.m mVar = (lg.m) obj;
                x2 x2Var = mVar.M;
                if (x2Var != null && x2Var.isShowing()) {
                    Activity parentActivity = mVar.getParentActivity();
                    i3 = ((org.telegram.ui.ActionBar.d2) mVar).classGuid;
                    org.telegram.messenger.g0.a3(parentActivity, i3);
                }
                super.K();
                break;
            case 2:
                wm wmVar = (wm) obj;
                x2 x2Var2 = wmVar.Y1;
                if (x2Var2 != null && (x2Var2.isShowing() || this.p2)) {
                    Activity parentActivity2 = wmVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
                    org.telegram.messenger.g0.a3(parentActivity2, i10);
                }
                super.K();
                wmVar.ta(false, true);
                kl klVar = wmVar.m1;
                if (klVar != null) {
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.y.c(klVar);
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

    @Override // org.telegram.ui.ActionBar.t2
    public void n0() {
        int i3;
        int i10;
        mj mjVar;
        int i11 = this.G4;
        Object obj = this.H4;
        switch (i11) {
            case 0:
                j4 j4Var = (j4) obj;
                x2 x2Var = j4Var.s2;
                if (x2Var != null) {
                    x2Var.A0(false);
                }
                s2 s2Var = j4Var.L1;
                if (s2Var != null && s2Var.getEditField() != null) {
                    j4Var.L1.getEditField().requestFocus();
                    break;
                }
                break;
            case 1:
                lg.m mVar = (lg.m) obj;
                x2 x2Var2 = mVar.M;
                if (x2Var2 != null) {
                    x2Var2.A0(false);
                }
                x2 x2Var3 = mVar.M;
                if (x2Var3 != null && x2Var3.isShowing()) {
                    Activity parentActivity = mVar.getParentActivity();
                    i3 = ((org.telegram.ui.ActionBar.d2) mVar).classGuid;
                    org.telegram.messenger.g0.a3(parentActivity, i3);
                    break;
                }
                break;
            case 2:
                wm wmVar = (wm) obj;
                boolean z10 = this.p2;
                boolean N = this.t2.N();
                if (!N) {
                    wmVar.S3 = false;
                    mj mjVar2 = wmVar.a0;
                    if (mjVar2 != null) {
                        if (!z10) {
                            mjVar2.L();
                        }
                        if (wmVar.a0.getEditField() != null) {
                            wmVar.a0.getEditField().clearFocus();
                        }
                    }
                }
                if (!z10) {
                    x2 x2Var4 = wmVar.Y1;
                    if (x2Var4 != null) {
                        x2Var4.A0(false);
                    }
                    if (N && (mjVar = wmVar.a0) != null && mjVar.getEditField() != null) {
                        wmVar.a0.getEditField().requestFocus();
                    }
                    x2 x2Var5 = wmVar.Y1;
                    if (x2Var5 != null && x2Var5.isShowing()) {
                        Activity parentActivity2 = wmVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
                        org.telegram.messenger.g0.a3(parentActivity2, i10);
                    }
                    wmVar.ta(false, false);
                    kl klVar = wmVar.m1;
                    if (klVar != null) {
                        WeakHashMap weakHashMap = r0.i0.a;
                        r0.y.c(klVar);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(Context context, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable) {
        super(context, d2Var, false, false, true, e6Var);
        this.G4 = 3;
        this.H4 = runnable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(j4 j4Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, false, false, true, e6Var);
        this.G4 = 0;
        this.H4 = j4Var;
    }
}
