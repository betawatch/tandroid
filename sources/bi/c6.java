package bi;

import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class c6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r7 b;

    public /* synthetic */ c6(r7 r7Var, int i10) {
        this.a = i10;
        this.b = r7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pg.w1 w1Var = this.b.d1;
                if (w1Var != null) {
                    w1Var.invalidate();
                    break;
                }
                break;
            case 1:
                new qg.a1((org.telegram.ui.ActionBar.p2) new o1(this.b, 1), 14, true).show();
                break;
            case 2:
                this.b.z0(false);
                break;
            default:
                r7 r7Var = this.b;
                boolean z10 = og.x0.e(r7Var.F1).k;
                int i10 = 0;
                while (true) {
                    List list = og.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        og.l lVar = (og.l) list.get(i10);
                        int m10 = z10 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        g3 g3Var = new g3(r7Var, lVar, m10, 2);
                        o7 o7Var = new o7(r7Var, r7Var.getContext());
                        o7Var.setIcon(m10);
                        o7Var.setText(n10);
                        o7Var.setSelected(false);
                        o7Var.setOnClickListener(new ai.u(g3Var, 5));
                        o7Var.setOnLongClickListener(new l6(r7Var, 0));
                        r7Var.I1.a(o7Var, w7.a6.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
