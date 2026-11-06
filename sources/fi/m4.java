package fi;

import java.util.List;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    public /* synthetic */ m4(o5 o5Var, int i7) {
        this.a = i7;
        this.b = o5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tg.m1 m1Var = this.b.M0;
                if (m1Var != null) {
                    m1Var.invalidate();
                    break;
                }
                break;
            case 1:
                new ug.w0((org.telegram.ui.ActionBar.f2) new bi.w4(this.b, 4), 14, true).show();
                break;
            case 2:
                this.b.w0(false);
                break;
            default:
                o5 o5Var = this.b;
                boolean z9 = sg.l0.e(o5Var.o1).k;
                int i7 = 0;
                while (true) {
                    List list = sg.g.c;
                    if (i7 >= list.size()) {
                        break;
                    } else {
                        sg.g gVar = (sg.g) list.get(i7);
                        int m10 = z9 ? gVar.m() : gVar.e();
                        String n10 = gVar.n();
                        ai.e0 e0Var = new ai.e0(o5Var, gVar, m10, 11);
                        l5 l5Var = new l5(o5Var, o5Var.getContext());
                        l5Var.setIcon(m10);
                        l5Var.setText(n10);
                        l5Var.setSelected(false);
                        l5Var.setOnClickListener(new ah.d(e0Var, 23));
                        l5Var.setOnLongClickListener(new s4(o5Var, 0));
                        o5Var.r1.a(l5Var, c8.ha.o(-1, 48));
                        i7++;
                    }
                }
        }
    }
}
