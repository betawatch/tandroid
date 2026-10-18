package ei;

import java.util.List;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                rg.w1 w1Var = this.b.d1;
                if (w1Var != null) {
                    w1Var.invalidate();
                    break;
                }
                break;
            case 1:
                new sg.x0((org.telegram.ui.ActionBar.n2) new ai.z4(this.b, 4), 14, true).show();
                break;
            case 2:
                this.b.y0(false);
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
