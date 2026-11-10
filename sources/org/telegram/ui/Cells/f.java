package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.zw;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                a80 a80Var = gVar.d;
                if (a80Var != null) {
                    gVar.h.E.n(a80Var, true);
                    break;
                }
                break;
            case 1:
                l1 l1Var = ((y1) this.b).e;
                if (l1Var != null) {
                    l1Var.k();
                    break;
                }
                break;
            case 2:
                ((d2) this.b).a();
                break;
            case 3:
                org.telegram.messenger.g0.v1(((zh.w3) this.b).b.getEditText());
                break;
            case 4:
                org.telegram.messenger.g0.v1(((k3) this.b).d);
                break;
            case 5:
                ((q5) this.b).a.invalidate();
                break;
            case 6:
                g6 g6Var = (g6) this.b;
                if (!(g6Var.getParent() instanceof pj0)) {
                    g6Var.callOnClick();
                    break;
                } else {
                    ((pj0) g6Var.getParent()).getOnItemClickListener().c(RecyclerView.R(g6Var), g6Var);
                    break;
                }
            case 7:
                ((o7) this.b).h();
                break;
            case 8:
                v9 v9Var = (v9) this.b;
                v9Var.C.invalidate();
                v9Var.T();
                break;
            case 9:
                ((v9) ((f9) this.b).c).T();
                break;
            case 10:
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
            case 11:
                zw zwVar = (zw) this.b;
                bc.e();
                zwVar.presentFragment(new SessionsActivity(0));
                break;
            default:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.b;
                w2Var.b0 = true;
                w2Var.c0 = true;
                break;
        }
    }
}
