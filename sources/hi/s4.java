package hi;

import java.util.List;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class s4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5 b;

    public /* synthetic */ s4(v5 v5Var, int i7) {
        this.a = i7;
        this.b = v5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tg.r1 r1Var = this.b.N0;
                if (r1Var != null) {
                    r1Var.invalidate();
                    break;
                }
                break;
            case 1:
                new ug.y0((org.telegram.ui.ActionBar.g2) new bi.e9(this.b, 5), 14, true).show();
                break;
            case 2:
                tg.r1 r1Var2 = this.b.N0;
                if (r1Var2 != null) {
                    r1Var2.invalidate();
                    break;
                }
                break;
            case 3:
                this.b.y0(false);
                break;
            default:
                v5 v5Var = this.b;
                boolean z10 = sg.j0.e(v5Var.p1).k;
                int i7 = 0;
                while (true) {
                    List list = sg.g.c;
                    if (i7 >= list.size()) {
                        break;
                    } else {
                        sg.g gVar = (sg.g) list.get(i7);
                        int m10 = z10 ? gVar.m() : gVar.e();
                        String n10 = gVar.n();
                        ai.e1 e1Var = new ai.e1(v5Var, gVar, m10, 15);
                        s5 s5Var = new s5(v5Var, v5Var.getContext());
                        s5Var.setIcon(m10);
                        s5Var.setText(n10);
                        s5Var.setSelected(false);
                        int i10 = 0;
                        s5Var.setOnClickListener(new z4(e1Var, i10));
                        s5Var.setOnLongClickListener(new y4(v5Var, i10));
                        v5Var.s1.a(s5Var, c8.na.o(-1, 48));
                        i7++;
                    }
                }
        }
    }
}
