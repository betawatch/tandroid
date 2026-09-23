package ci;

import java.util.List;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class f5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q6 b;

    public /* synthetic */ f5(q6 q6Var, int i10) {
        this.a = i10;
        this.b = q6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qg.z1 z1Var = this.b.d1;
                if (z1Var != null) {
                    z1Var.invalidate();
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
                q6 q6Var = this.b;
                boolean z10 = pg.t0.e(q6Var.F1).k;
                int i10 = 0;
                while (true) {
                    List list = pg.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        pg.l lVar = (pg.l) list.get(i10);
                        int m10 = z10 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        ai.s1 s1Var = new ai.s1(q6Var, lVar, m10, 5);
                        n6 n6Var = new n6(q6Var, q6Var.getContext());
                        n6Var.setIcon(m10);
                        n6Var.setText(n10);
                        n6Var.setSelected(false);
                        n6Var.setOnClickListener(new ai.v0(s1Var, 10));
                        n6Var.setOnLongClickListener(new m5(q6Var, 0));
                        q6Var.I1.a(n6Var, w7.x5.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
