package di;

import java.util.List;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o6 b;

    public /* synthetic */ e5(o6 o6Var, int i10) {
        this.a = i10;
        this.b = o6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rg.y1 y1Var = this.b.d1;
                if (y1Var != null) {
                    y1Var.invalidate();
                    break;
                }
                break;
            case 1:
                new sg.y0((org.telegram.ui.ActionBar.m2) new bi.o3(this.b, 3), 14, true).show();
                break;
            case 2:
                this.b.y0(false);
                break;
            default:
                o6 o6Var = this.b;
                boolean z10 = qg.s0.e(o6Var.F1).k;
                int i10 = 0;
                while (true) {
                    List list = qg.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        qg.l lVar = (qg.l) list.get(i10);
                        int m10 = z10 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        ah.o oVar = new ah.o(o6Var, lVar, m10, 6);
                        l6 l6Var = new l6(o6Var, o6Var.getContext());
                        l6Var.setIcon(m10);
                        l6Var.setText(n10);
                        l6Var.setSelected(false);
                        l6Var.setOnClickListener(new ah.g0(oVar, 11));
                        l6Var.setOnLongClickListener(new l5(o6Var, 0));
                        o6Var.I1.a(l6Var, w7.z5.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
