package ai;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import ci.wb;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.l00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f6 extends f41 {
    public final /* synthetic */ int Q;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f6(KeyEvent.Callback callback, tj0 tj0Var, Context context, int i3, n10 n10Var, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(tj0Var, context, i3, 0, false, n10Var, e6Var);
        this.Q = i10;
        this.R = callback;
    }

    @Override // org.telegram.ui.Components.f41, u4.h0
    public void t(u4.d1 d1Var, int i3) {
        ei.p0 p0Var;
        ei.u0 u0Var;
        switch (this.Q) {
            case 2:
                super.t(d1Var, i3);
                ei.k2 k2Var = (ei.k2) this.R;
                if (k2Var.E) {
                    View view = d1Var.a;
                    if ((view instanceof ei.p0) && (u0Var = (p0Var = (ei.p0) view).L) != null && u0Var.a == k2Var.y) {
                        p0Var.a();
                        k2Var.E = false;
                        break;
                    }
                }
                break;
            default:
                super.t(d1Var, i3);
                break;
        }
    }

    @Override // org.telegram.ui.Components.f41, u4.h0
    public u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        org.telegram.ui.ActionBar.e6 e6Var4;
        switch (this.Q) {
            case 0:
                h6 h6Var = (h6) this.R;
                if (i3 != 0) {
                    if (i3 != 42) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 1:
                wb wbVar = (wb) this.R;
                if (i3 != 42) {
                    break;
                } else {
                    Activity parentActivity = wbVar.getParentActivity();
                    int i10 = org.telegram.ui.ActionBar.k6.L6;
                    e6Var = ((org.telegram.ui.ActionBar.d2) wbVar).resourceProvider;
                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(parentActivity, i10, 21, 0, false, e6Var);
                    n4Var.setHeight(25);
                    break;
                }
            case 3:
                hi.g gVar = (hi.g) this.R;
                if (i3 != 42) {
                    break;
                } else {
                    Activity parentActivity2 = gVar.getParentActivity();
                    int i11 = org.telegram.ui.ActionBar.k6.L6;
                    e6Var2 = ((org.telegram.ui.ActionBar.d2) gVar).resourceProvider;
                    org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(parentActivity2, i11, 21, 0, false, e6Var2);
                    n4Var2.setHeight(25);
                    break;
                }
            case 4:
                ii.k kVar = (ii.k) this.R;
                if (i3 != 42) {
                    break;
                } else {
                    Activity parentActivity3 = kVar.getParentActivity();
                    int i12 = org.telegram.ui.ActionBar.k6.L6;
                    e6Var3 = ((org.telegram.ui.ActionBar.d2) kVar).resourceProvider;
                    org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(parentActivity3, i12, 21, 0, false, e6Var3);
                    n4Var3.setHeight(25);
                    break;
                }
            case 5:
                ii.q3 q3Var = (ii.q3) this.R;
                if (i3 != 42) {
                    break;
                } else {
                    Activity parentActivity4 = q3Var.getParentActivity();
                    int i13 = org.telegram.ui.ActionBar.k6.L6;
                    e6Var4 = ((org.telegram.ui.ActionBar.d2) q3Var).resourceProvider;
                    org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(parentActivity4, i13, 21, 0, false, e6Var4);
                    n4Var4.setHeight(25);
                    break;
                }
        }
        return super.x(viewGroup, i3);
    }

    @Override // org.telegram.ui.Components.f41, u4.h0
    public void y(u4.d1 d1Var) {
        ei.p0 p0Var;
        ei.u0 u0Var;
        switch (this.Q) {
            case 2:
                super.y(d1Var);
                ei.k2 k2Var = (ei.k2) this.R;
                if (k2Var.E) {
                    View view = d1Var.a;
                    if ((view instanceof ei.p0) && (u0Var = (p0Var = (ei.p0) view).L) != null && u0Var.a == k2Var.y) {
                        p0Var.a();
                        k2Var.E = false;
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
    public /* synthetic */ f6(l00 l00Var, tj0 tj0Var, Activity activity, int i3, int i10, n10 n10Var, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        super(tj0Var, activity, i3, i10, true, n10Var, e6Var);
        this.Q = i11;
        this.R = l00Var;
    }
}
