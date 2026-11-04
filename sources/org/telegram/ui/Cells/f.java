package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g gVar = (g) this.b;
                w70 w70Var = gVar.d;
                if (w70Var != null) {
                    gVar.h.F.n(w70Var, true);
                    break;
                }
                break;
            case 1:
                l1 l1Var = ((y1) this.b).e;
                if (l1Var != null) {
                    l1Var.j();
                    break;
                }
                break;
            case 2:
                ((d2) this.b).a();
                break;
            case 3:
                org.telegram.messenger.g0.v1(((ai.x6) this.b).b.getEditText());
                break;
            case 4:
                org.telegram.messenger.g0.v1(((k3) this.b).d);
                break;
            case 5:
                ((q5) this.b).a.invalidate();
                break;
            case 6:
                f6 f6Var = (f6) this.b;
                if (!(f6Var.getParent() instanceof tj0)) {
                    f6Var.callOnClick();
                    break;
                } else {
                    ((tj0) f6Var.getParent()).getOnItemClickListener().f(RecyclerView.R(f6Var), f6Var);
                    break;
                }
            case 7:
                ((n7) this.b).h();
                break;
            case 8:
                u9 u9Var = (u9) this.b;
                u9Var.C.invalidate();
                u9Var.T();
                break;
            case 9:
                ((u9) ((e9) this.b).c).T();
                break;
            case 10:
                z9 z9Var = (z9) this.b;
                z9Var.y = -1;
                int i3 = 0;
                while (true) {
                    q1[] q1VarArr = z9Var.n;
                    if (i3 >= q1VarArr.length) {
                        break;
                    } else {
                        q1 q1Var = q1VarArr[i3];
                        if (q1Var != null) {
                            q1Var.invalidate();
                        }
                        i3++;
                    }
                }
            case 11:
                uw uwVar = (uw) this.b;
                ac.e();
                uwVar.presentFragment(new SessionsActivity(0));
                break;
            default:
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.b;
                t2Var.c0 = true;
                t2Var.d0 = true;
                break;
        }
    }
}
