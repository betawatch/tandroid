package hi;

import java.util.List;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class i4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l5 b;

    public /* synthetic */ i4(l5 l5Var, int i7) {
        this.a = i7;
        this.b = l5Var;
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
                new ug.z0((org.telegram.ui.ActionBar.h2) new bi.z8(this.b, 5), 14, true).show();
                break;
            case 2:
                this.b.w0(false);
                break;
            default:
                l5 l5Var = this.b;
                boolean z10 = sg.k0.e(l5Var.p1).k;
                int i7 = 0;
                while (true) {
                    List list = sg.g.c;
                    if (i7 >= list.size()) {
                        break;
                    } else {
                        sg.g gVar = (sg.g) list.get(i7);
                        int m10 = z10 ? gVar.m() : gVar.e();
                        String n10 = gVar.n();
                        ai.a1 a1Var = new ai.a1(l5Var, gVar, m10, 16);
                        i5 i5Var = new i5(l5Var, l5Var.getContext());
                        i5Var.setIcon(m10);
                        i5Var.setText(n10);
                        i5Var.setSelected(false);
                        i5Var.setOnClickListener(new o0(a1Var, 1));
                        i5Var.setOnLongClickListener(new o4(l5Var, 0));
                        l5Var.s1.a(i5Var, c8.ma.o(-1, 48));
                        i7++;
                    }
                }
        }
    }
}
