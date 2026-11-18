package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.g21;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.o80;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.cx;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                o80 o80Var = gVar.d;
                if (o80Var != null) {
                    gVar.h.F.n(o80Var, true);
                    break;
                }
                break;
            case 1:
                fj fjVar = (fj) this.b;
                if (g21.j(fjVar)) {
                    g21.x(fjVar, false, null);
                    break;
                }
                break;
            case 2:
                l1 l1Var = ((y1) this.b).e;
                if (l1Var != null) {
                    l1Var.m();
                    break;
                }
                break;
            case 3:
                ((d2) this.b).a();
                break;
            case 4:
                org.telegram.messenger.g0.v1(((bi.u8) this.b).b.getEditText());
                break;
            case 5:
                org.telegram.messenger.g0.v1(((k3) this.b).d);
                break;
            case 6:
                ((r5) this.b).a.invalidate();
                break;
            case 7:
                g6 g6Var = (g6) this.b;
                if (!(g6Var.getParent() instanceof ck0)) {
                    g6Var.callOnClick();
                    break;
                } else {
                    ((ck0) g6Var.getParent()).getOnItemClickListener().c(RecyclerView.R(g6Var), g6Var);
                    break;
                }
            case 8:
                ((o7) this.b).h();
                break;
            case 9:
                v9 v9Var = (v9) this.b;
                v9Var.C.invalidate();
                v9Var.T();
                break;
            case 10:
                ((v9) ((f9) this.b).c).T();
                break;
            case 11:
                aa aaVar = (aa) this.b;
                aaVar.y = -1;
                int i7 = 0;
                while (true) {
                    q1[] q1VarArr = aaVar.n;
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
                cx cxVar = (cx) this.b;
                gc.e();
                cxVar.presentFragment(new SessionsActivity(0));
                break;
            default:
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) this.b;
                x2Var.c0 = true;
                x2Var.d0 = true;
                break;
        }
    }
}
