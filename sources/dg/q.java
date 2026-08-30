package dg;

import java.util.List;
import k7.b6;
import org.telegram.ui.Components.a11;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;

    public /* synthetic */ q(e1 e1Var, int i10) {
        this.a = i10;
        this.b = e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e1 e1Var = this.b;
                a11 a11Var = e1Var.X0;
                if (a11Var != null) {
                    e1Var.X0 = null;
                    e1Var.removeView(a11Var);
                    break;
                }
                break;
            case 1:
                e1 e1Var2 = this.b;
                if (e1Var2.B0 != null) {
                    e1Var2.D0.postRunnable(new q(e1Var2, 3), 200L);
                    break;
                }
                break;
            case 2:
                t2 t2Var = this.b.i1;
                if (t2Var != null) {
                    t2Var.invalidate();
                    break;
                }
                break;
            case 3:
                e1.a0(this.b);
                break;
            default:
                e1 e1Var3 = this.b;
                boolean z4 = cg.f1.e(e1Var3.M1).k;
                int i10 = 0;
                while (true) {
                    List list = cg.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        cg.l lVar = (cg.l) list.get(i10);
                        int m9 = z4 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        ah.a aVar = new ah.a(e1Var3, lVar, m9, 2);
                        c1 c1Var = new c1(e1Var3, e1Var3.getContext());
                        c1Var.setIcon(m9);
                        c1Var.setText(n10);
                        c1Var.setSelected(false);
                        c1Var.setOnClickListener(new androidx.mediarouter.app.c(aVar, 2));
                        c1Var.setOnLongClickListener(new f0(e1Var3, 0));
                        e1Var3.P1.a(c1Var, b6.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
