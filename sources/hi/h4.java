package hi;

import java.util.List;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5 b;

    public /* synthetic */ h4(k5 k5Var, int i7) {
        this.a = i7;
        this.b = k5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tg.n1 n1Var = this.b.N0;
                if (n1Var != null) {
                    n1Var.invalidate();
                    break;
                }
                break;
            case 1:
                new ug.y0((org.telegram.ui.ActionBar.g2) new bi.b9(this.b, 5), 14, true).show();
                break;
            case 2:
                this.b.w0(false);
                break;
            default:
                k5 k5Var = this.b;
                boolean z10 = sg.k0.e(k5Var.p1).k;
                int i7 = 0;
                while (true) {
                    List list = sg.g.c;
                    if (i7 >= list.size()) {
                        break;
                    } else {
                        sg.g gVar = (sg.g) list.get(i7);
                        int m10 = z10 ? gVar.m() : gVar.e();
                        String n10 = gVar.n();
                        ai.j1 j1Var = new ai.j1(k5Var, gVar, m10, 15);
                        h5 h5Var = new h5(k5Var, k5Var.getContext());
                        h5Var.setIcon(m10);
                        h5Var.setText(n10);
                        h5Var.setSelected(false);
                        h5Var.setOnClickListener(new o4(j1Var, 0));
                        h5Var.setOnLongClickListener(new n4(k5Var, 0));
                        k5Var.s1.a(h5Var, c8.ma.o(-1, 48));
                        i7++;
                    }
                }
        }
    }
}
