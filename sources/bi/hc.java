package bi;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.q00;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class hc extends m41 {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hc(KeyEvent.Callback callback, qj0 qj0Var, Context context, int i7, v10 v10Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(qj0Var, context, i7, 0, false, v10Var, g6Var);
        this.P = i10;
        this.Q = callback;
    }

    @Override // org.telegram.ui.Components.m41, v4.g0
    public void t(v4.d1 d1Var, int i7) {
        di.n0 n0Var;
        di.s0 s0Var;
        switch (this.P) {
            case 1:
                super.t(d1Var, i7);
                di.g2 g2Var = (di.g2) this.Q;
                if (g2Var.D) {
                    View view = d1Var.a;
                    if ((view instanceof di.n0) && (s0Var = (n0Var = (di.n0) view).K) != null && s0Var.a == g2Var.y) {
                        n0Var.a();
                        g2Var.D = false;
                        break;
                    }
                }
                break;
            default:
                super.t(d1Var, i7);
                break;
        }
    }

    @Override // org.telegram.ui.Components.m41, v4.g0
    public v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4;
        switch (this.P) {
            case 0:
                dd ddVar = (dd) this.Q;
                if (i7 != 42) {
                    break;
                } else {
                    Activity parentActivity = ddVar.getParentActivity();
                    int i10 = org.telegram.ui.ActionBar.l6.L6;
                    g6Var = ((org.telegram.ui.ActionBar.f2) ddVar).resourceProvider;
                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(parentActivity, i10, 21, 0, false, g6Var);
                    n4Var.setHeight(25);
                    break;
                }
            case 2:
                gi.f fVar = (gi.f) this.Q;
                if (i7 != 42) {
                    break;
                } else {
                    Activity parentActivity2 = fVar.getParentActivity();
                    int i11 = org.telegram.ui.ActionBar.l6.L6;
                    g6Var2 = ((org.telegram.ui.ActionBar.f2) fVar).resourceProvider;
                    org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(parentActivity2, i11, 21, 0, false, g6Var2);
                    n4Var2.setHeight(25);
                    break;
                }
            case 3:
                hi.j jVar = (hi.j) this.Q;
                if (i7 != 42) {
                    break;
                } else {
                    Activity parentActivity3 = jVar.getParentActivity();
                    int i12 = org.telegram.ui.ActionBar.l6.L6;
                    g6Var3 = ((org.telegram.ui.ActionBar.f2) jVar).resourceProvider;
                    org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(parentActivity3, i12, 21, 0, false, g6Var3);
                    n4Var3.setHeight(25);
                    break;
                }
            case 4:
                hi.q3 q3Var = (hi.q3) this.Q;
                if (i7 != 42) {
                    break;
                } else {
                    Activity parentActivity4 = q3Var.getParentActivity();
                    int i13 = org.telegram.ui.ActionBar.l6.L6;
                    g6Var4 = ((org.telegram.ui.ActionBar.f2) q3Var).resourceProvider;
                    org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(parentActivity4, i13, 21, 0, false, g6Var4);
                    n4Var4.setHeight(25);
                    break;
                }
            case 5:
                zh.l3 l3Var = (zh.l3) this.Q;
                if (i7 != 0) {
                    if (i7 != 42) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
        }
        return super.x(viewGroup, i7);
    }

    @Override // org.telegram.ui.Components.m41, v4.g0
    public void y(v4.d1 d1Var) {
        di.n0 n0Var;
        di.s0 s0Var;
        switch (this.P) {
            case 1:
                super.y(d1Var);
                di.g2 g2Var = (di.g2) this.Q;
                if (g2Var.D) {
                    View view = d1Var.a;
                    if ((view instanceof di.n0) && (s0Var = (n0Var = (di.n0) view).K) != null && s0Var.a == g2Var.y) {
                        n0Var.a();
                        g2Var.D = false;
                        break;
                    }
                }
                break;
            default:
                super.y(d1Var);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hc(q00 q00Var, qj0 qj0Var, Activity activity, int i7, int i10, v10 v10Var, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(qj0Var, activity, i7, i10, true, v10Var, g6Var);
        this.P = i11;
        this.Q = q00Var;
    }
}
