package di;

import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class g5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q6 b;

    public /* synthetic */ g5(q6 q6Var, int i10) {
        this.a = i10;
        this.b = q6Var;
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
                new sg.a1((org.telegram.ui.ActionBar.n2) new bi.l3(this.b, 3), 14, true).show();
                break;
            case 2:
                this.b.z0(false);
                break;
            default:
                q6 q6Var = this.b;
                boolean z10 = qg.s0.e(q6Var.F1).k;
                int i10 = 0;
                while (true) {
                    List list = qg.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        qg.l lVar = (qg.l) list.get(i10);
                        int m10 = z10 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        ah.p pVar = new ah.p(q6Var, lVar, m10, 6);
                        n6 n6Var = new n6(q6Var, q6Var.getContext());
                        n6Var.setIcon(m10);
                        n6Var.setText(n10);
                        n6Var.setSelected(false);
                        n6Var.setOnClickListener(new ah.h0(pVar, 11));
                        n6Var.setOnLongClickListener(new n5(q6Var, 0));
                        q6Var.I1.a(n6Var, w7.x5.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
