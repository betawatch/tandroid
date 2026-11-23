package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.gj;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.j21;
import org.telegram.ui.Components.q80;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.cx;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                q80 q80Var = gVar.d;
                if (q80Var != null) {
                    gVar.h.F.n(q80Var, true);
                    break;
                }
                break;
            case 1:
                gj gjVar = (gj) this.b;
                if (j21.k(gjVar)) {
                    j21.z(gjVar, false, null);
                    break;
                }
                break;
            case 2:
                m1 m1Var = ((z1) this.b).e;
                if (m1Var != null) {
                    m1Var.m();
                    break;
                }
                break;
            case 3:
                ((e2) this.b).a();
                break;
            case 4:
                org.telegram.messenger.g0.v1(((bi.w8) this.b).b.getEditText());
                break;
            case 5:
                org.telegram.messenger.g0.v1(((l3) this.b).d);
                break;
            case 6:
                ((s5) this.b).a.invalidate();
                break;
            case 7:
                h6 h6Var = (h6) this.b;
                if (!(h6Var.getParent() instanceof ek0)) {
                    h6Var.callOnClick();
                    break;
                } else {
                    ((ek0) h6Var.getParent()).getOnItemClickListener().c(RecyclerView.R(h6Var), h6Var);
                    break;
                }
            case 8:
                ((p7) this.b).h();
                break;
            case 9:
                w9 w9Var = (w9) this.b;
                w9Var.C.invalidate();
                w9Var.T();
                break;
            case 10:
                ((w9) ((g9) this.b).c).T();
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
                cx cxVar = (cx) this.b;
                gc.e();
                cxVar.presentFragment(new SessionsActivity(0));
                break;
            default:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.b;
                w2Var.c0 = true;
                w2Var.d0 = true;
                break;
        }
    }
}
