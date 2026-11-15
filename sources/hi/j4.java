package hi;

import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class j4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5 b;

    public /* synthetic */ j4(m5 m5Var, int i7) {
        this.a = i7;
        this.b = m5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tg.m1 m1Var = this.b.N0;
                if (m1Var != null) {
                    m1Var.invalidate();
                    break;
                }
                break;
            case 1:
                new ug.x0((org.telegram.ui.ActionBar.e2) new bi.t6(this.b, 5), 14, true).show();
                break;
            case 2:
                this.b.w0(false);
                break;
            default:
                m5 m5Var = this.b;
                boolean z10 = sg.k0.e(m5Var.p1).k;
                int i7 = 0;
                while (true) {
                    List list = sg.g.c;
                    if (i7 >= list.size()) {
                        break;
                    } else {
                        sg.g gVar = (sg.g) list.get(i7);
                        int m10 = z10 ? gVar.m() : gVar.e();
                        String n10 = gVar.n();
                        ai.a1 a1Var = new ai.a1(m5Var, gVar, m10, 15);
                        j5 j5Var = new j5(m5Var, m5Var.getContext());
                        j5Var.setIcon(m10);
                        j5Var.setText(n10);
                        j5Var.setSelected(false);
                        j5Var.setOnClickListener(new ah.d(a1Var, 29));
                        j5Var.setOnLongClickListener(new p4(m5Var, 0));
                        m5Var.s1.a(j5Var, c8.ja.o(-1, 48));
                        i7++;
                    }
                }
        }
    }
}
