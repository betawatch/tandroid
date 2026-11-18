package fi;

import android.app.Activity;
import android.content.Context;
import java.util.WeakHashMap;
import org.telegram.ui.Components.si;
import org.telegram.ui.bn;
import org.telegram.ui.pl;
import org.telegram.ui.rj;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class n2 extends si {
    public final /* synthetic */ int J4;
    public final /* synthetic */ Object K4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(org.telegram.ui.ActionBar.h2 h2Var, Activity activity, org.telegram.ui.ActionBar.h2 h2Var2, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(activity, h2Var2, false, false, true, i6Var);
        this.J4 = i7;
        this.K4 = h2Var;
    }

    @Override // org.telegram.ui.Components.si, org.telegram.ui.ActionBar.x2
    public void L() {
        int i7;
        int i10;
        int i11 = this.J4;
        Object obj = this.K4;
        switch (i11) {
            case 1:
                kg.n nVar = (kg.n) obj;
                n2 n2Var = nVar.M;
                if (n2Var != null && n2Var.isShowing()) {
                    Activity parentActivity = nVar.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.h2) nVar).classGuid;
                    org.telegram.messenger.g0.Z2(parentActivity, i7);
                }
                super.L();
                break;
            case 2:
                bn bnVar = (bn) obj;
                n2 n2Var2 = bnVar.Y1;
                if (n2Var2 != null && (n2Var2.isShowing() || this.s2)) {
                    Activity parentActivity2 = bnVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
                    org.telegram.messenger.g0.Z2(parentActivity2, i10);
                }
                super.L();
                bnVar.wa(false, true);
                pl plVar = bnVar.m1;
                if (plVar != null) {
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.y.c(plVar);
                    break;
                }
                break;
            case 3:
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

    @Override // org.telegram.ui.ActionBar.x2
    public void n0() {
        int i7;
        int i10;
        rj rjVar;
        int i11 = this.J4;
        Object obj = this.K4;
        switch (i11) {
            case 0:
                z3 z3Var = (z3) obj;
                n2 n2Var = z3Var.s2;
                if (n2Var != null) {
                    n2Var.A0(false);
                }
                i2 i2Var = z3Var.L1;
                if (i2Var != null && i2Var.getEditField() != null) {
                    z3Var.L1.getEditField().requestFocus();
                    break;
                }
                break;
            case 1:
                kg.n nVar = (kg.n) obj;
                n2 n2Var2 = nVar.M;
                if (n2Var2 != null) {
                    n2Var2.A0(false);
                }
                n2 n2Var3 = nVar.M;
                if (n2Var3 != null && n2Var3.isShowing()) {
                    Activity parentActivity = nVar.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.h2) nVar).classGuid;
                    org.telegram.messenger.g0.Z2(parentActivity, i7);
                    break;
                }
                break;
            case 2:
                bn bnVar = (bn) obj;
                boolean z10 = this.s2;
                boolean O = this.w2.O();
                if (!O) {
                    bnVar.S3 = false;
                    rj rjVar2 = bnVar.a0;
                    if (rjVar2 != null) {
                        if (!z10) {
                            rjVar2.U();
                        }
                        if (bnVar.a0.getEditField() != null) {
                            bnVar.a0.getEditField().clearFocus();
                        }
                    }
                }
                if (!z10) {
                    n2 n2Var4 = bnVar.Y1;
                    if (n2Var4 != null) {
                        n2Var4.A0(false);
                    }
                    if (O && (rjVar = bnVar.a0) != null && rjVar.getEditField() != null) {
                        bnVar.a0.getEditField().requestFocus();
                    }
                    n2 n2Var5 = bnVar.Y1;
                    if (n2Var5 != null && n2Var5.isShowing()) {
                        Activity parentActivity2 = bnVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
                        org.telegram.messenger.g0.Z2(parentActivity2, i10);
                    }
                    bnVar.wa(false, false);
                    pl plVar = bnVar.m1;
                    if (plVar != null) {
                        WeakHashMap weakHashMap = r0.i0.a;
                        r0.y.c(plVar);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(Context context, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.i6 i6Var, Runnable runnable) {
        super(context, h2Var, false, false, true, i6Var);
        this.J4 = 3;
        this.K4 = runnable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(z3 z3Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, false, false, true, i6Var);
        this.J4 = 0;
        this.K4 = z3Var;
    }
}
