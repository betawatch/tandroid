package ci;

import java.util.List;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class g5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r6 b;

    public /* synthetic */ g5(r6 r6Var, int i10) {
        this.a = i10;
        this.b = r6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qg.x1 x1Var = this.b.d1;
                if (x1Var != null) {
                    x1Var.invalidate();
                    break;
                }
                break;
            case 1:
                new rg.x0((org.telegram.ui.ActionBar.n2) new ai.y3(this.b, 3), 14, true).show();
                break;
            case 2:
                this.b.z0(false);
                break;
            default:
                r6 r6Var = this.b;
                boolean z10 = pg.u0.e(r6Var.F1).k;
                int i10 = 0;
                while (true) {
                    List list = pg.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        pg.l lVar = (pg.l) list.get(i10);
                        int m10 = z10 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        ai.s1 s1Var = new ai.s1(r6Var, lVar, m10, 5);
                        o6 o6Var = new o6(r6Var, r6Var.getContext());
                        o6Var.setIcon(m10);
                        o6Var.setText(n10);
                        o6Var.setSelected(false);
                        o6Var.setOnClickListener(new ai.v0(s1Var, 10));
                        o6Var.setOnLongClickListener(new n5(r6Var, 0));
                        r6Var.I1.a(o6Var, w7.y5.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
