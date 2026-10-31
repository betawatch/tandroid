package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.ay;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g gVar = (g) this.b;
                t80 t80Var = gVar.d;
                if (t80Var != null) {
                    gVar.h.E.n(t80Var, true);
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
                org.telegram.messenger.i0.v1(((ph.b4) this.b).b.getEditText());
                break;
            case 4:
                org.telegram.messenger.i0.v1(((m3) this.b).d);
                break;
            case 5:
                k6 k6Var = (k6) this.b;
                if (!(k6Var.getParent() instanceof tk0)) {
                    k6Var.callOnClick();
                    break;
                } else {
                    ((tk0) k6Var.getParent()).getOnItemClickListener().f(RecyclerView.R(k6Var), k6Var);
                    break;
                }
            case 6:
                ((s7) this.b).h();
                break;
            case 7:
                w9 w9Var = (w9) this.b;
                w9Var.C.invalidate();
                w9Var.T();
                break;
            case 8:
                ((w9) ((h9) this.b).c).T();
                break;
            case 9:
                z9 z9Var = (z9) this.b;
                z9Var.y = -1;
                int i10 = 0;
                while (true) {
                    q1[] q1VarArr = z9Var.n;
                    if (i10 >= q1VarArr.length) {
                        break;
                    } else {
                        q1 q1Var = q1VarArr[i10];
                        if (q1Var != null) {
                            q1Var.invalidate();
                        }
                        i10++;
                    }
                }
            case 10:
                ay ayVar = (ay) this.b;
                wb.e();
                ayVar.presentFragment(new SessionsActivity(0));
                break;
            default:
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.b;
                z2Var.b0 = true;
                z2Var.c0 = true;
                break;
        }
    }
}
