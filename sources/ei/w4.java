package ei;

import java.util.List;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ w4(f6 f6Var, int i10) {
        this.a = i10;
        this.b = f6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rg.x1 x1Var = this.b.d1;
                if (x1Var != null) {
                    x1Var.invalidate();
                    break;
                }
                break;
            case 1:
                new sg.y0((org.telegram.ui.ActionBar.o2) new ai.a5(this.b, 4), 14, true).show();
                break;
            case 2:
                this.b.x0(false);
                break;
            default:
                f6 f6Var = this.b;
                boolean z10 = qg.u0.e(f6Var.F1).k;
                int i10 = 0;
                while (true) {
                    List list = qg.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        qg.l lVar = (qg.l) list.get(i10);
                        int m10 = z10 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        ah.o oVar = new ah.o(f6Var, lVar, m10, 11);
                        c6 c6Var = new c6(f6Var, f6Var.getContext());
                        c6Var.setIcon(m10);
                        c6Var.setText(n10);
                        c6Var.setSelected(false);
                        c6Var.setOnClickListener(new ah.g0(oVar, 21));
                        c6Var.setOnLongClickListener(new c5(f6Var, 0));
                        f6Var.I1.a(c6Var, w7.z5.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
