package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.i21;
import org.telegram.ui.Components.n80;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.bx;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                n80 n80Var = gVar.d;
                if (n80Var != null) {
                    gVar.h.F.n(n80Var, true);
                    break;
                }
                break;
            case 1:
                fj fjVar = (fj) this.b;
                if (i21.k(fjVar)) {
                    i21.z(fjVar, false, null);
                    break;
                }
                break;
            case 2:
                m1 m1Var = ((z1) this.b).e;
                if (m1Var != null) {
                    m1Var.p();
                    break;
                }
                break;
            case 3:
                ((e2) this.b).a();
                break;
            case 4:
                org.telegram.messenger.g0.v1(((bi.z8) this.b).b.getEditText());
                break;
            case 5:
                org.telegram.messenger.g0.v1(((l3) this.b).d);
                break;
            case 6:
                ((r5) this.b).a.invalidate();
                break;
            case 7:
                g6 g6Var = (g6) this.b;
                if (!(g6Var.getParent() instanceof ek0)) {
                    g6Var.callOnClick();
                    break;
                } else {
                    ((ek0) g6Var.getParent()).getOnItemClickListener().b(RecyclerView.R(g6Var), g6Var);
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
                ba baVar = (ba) this.b;
                baVar.y = -1;
                int i7 = 0;
                while (true) {
                    r1[] r1VarArr = baVar.n;
                    if (i7 >= r1VarArr.length) {
                        break;
                    } else {
                        r1 r1Var = r1VarArr[i7];
                        if (r1Var != null) {
                            r1Var.invalidate();
                        }
                        i7++;
                    }
                }
            case 12:
                bx bxVar = (bx) this.b;
                fc.e();
                bxVar.presentFragment(new SessionsActivity(0));
                break;
            default:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.b;
                w2Var.c0 = true;
                w2Var.d0 = true;
                break;
        }
    }
}
