package gi;

import b8.mf;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5 b;

    public /* synthetic */ j4(m5 m5Var, int i3) {
        this.a = i3;
        this.b = m5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ug.l1 l1Var = this.b.N0;
                if (l1Var != null) {
                    l1Var.invalidate();
                    break;
                }
                break;
            case 1:
                new vg.v0((org.telegram.ui.ActionBar.d2) new ai.c7(this.b, 5), 14, true).show();
                break;
            case 2:
                this.b.w0(false);
                break;
            default:
                m5 m5Var = this.b;
                boolean z10 = tg.k0.e(m5Var.p1).k;
                int i3 = 0;
                while (true) {
                    List list = tg.g.c;
                    if (i3 >= list.size()) {
                        break;
                    } else {
                        tg.g gVar = (tg.g) list.get(i3);
                        int m10 = z10 ? gVar.m() : gVar.e();
                        String n4 = gVar.n();
                        ai.e3 e3Var = new ai.e3(m5Var, gVar, m10, 13);
                        j5 j5Var = new j5(m5Var, m5Var.getContext());
                        j5Var.setIcon(m10);
                        j5Var.setText(n4);
                        j5Var.setSelected(false);
                        j5Var.setOnClickListener(new ai.b(e3Var, 26));
                        j5Var.setOnLongClickListener(new p4(m5Var, 0));
                        m5Var.s1.a(j5Var, mf.o(-1, 48));
                        i3++;
                    }
                }
        }
    }
}
