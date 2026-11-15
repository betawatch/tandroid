package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.gj;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.x11;
import org.telegram.ui.Components.xb;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g gVar = (g) this.b;
                d80 d80Var = gVar.d;
                if (d80Var != null) {
                    gVar.h.F.o(d80Var, true);
                    break;
                }
                break;
            case 1:
                gj gjVar = (gj) this.b;
                if (x11.j(gjVar)) {
                    x11.x(gjVar, false, null);
                    break;
                }
                break;
            case 2:
                l1 l1Var = ((y1) this.b).e;
                if (l1Var != null) {
                    l1Var.k();
                    break;
                }
                break;
            case 3:
                ((d2) this.b).a();
                break;
            case 4:
                org.telegram.messenger.g0.v1(((bi.o6) this.b).b.getEditText());
                break;
            case 5:
                org.telegram.messenger.g0.v1(((k3) this.b).d);
                break;
            case 6:
                ((q5) this.b).a.invalidate();
                break;
            case 7:
                f6 f6Var = (f6) this.b;
                if (!(f6Var.getParent() instanceof uj0)) {
                    f6Var.callOnClick();
                    break;
                } else {
                    ((uj0) f6Var.getParent()).getOnItemClickListener().b(RecyclerView.R(f6Var), f6Var);
                    break;
                }
            case 8:
                ((n7) this.b).h();
                break;
            case 9:
                u9 u9Var = (u9) this.b;
                u9Var.C.invalidate();
                u9Var.T();
                break;
            case 10:
                ((u9) ((e9) this.b).c).T();
                break;
            case 11:
                z9 z9Var = (z9) this.b;
                z9Var.y = -1;
                int i7 = 0;
                while (true) {
                    q1[] q1VarArr = z9Var.n;
                    if (i7 >= q1VarArr.length) {
                        break;
                    } else {
                        q1 q1Var = q1VarArr[i7];
                        if (q1Var != null) {
                            q1Var.invalidate();
                        }
                        i7++;
                    }
                }
            case 12:
                yw ywVar = (yw) this.b;
                xb.e();
                ywVar.presentFragment(new SessionsActivity(0));
                break;
            default:
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.b;
                u2Var.c0 = true;
                u2Var.d0 = true;
                break;
        }
    }
}
