package eg;

import java.util.List;
import k7.c6;
import org.telegram.ui.Components.a11;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ p(c1 c1Var, int i10) {
        this.a = i10;
        this.b = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c1 c1Var = this.b;
                a11 a11Var = c1Var.X0;
                if (a11Var != null) {
                    c1Var.X0 = null;
                    c1Var.removeView(a11Var);
                    break;
                }
                break;
            case 1:
                c1 c1Var2 = this.b;
                if (c1Var2.B0 != null) {
                    c1Var2.D0.postRunnable(new p(c1Var2, 3), 200L);
                    break;
                }
                break;
            case 2:
                r2 r2Var = this.b.i1;
                if (r2Var != null) {
                    r2Var.invalidate();
                    break;
                }
                break;
            case 3:
                c1.a0(this.b);
                break;
            default:
                c1 c1Var3 = this.b;
                boolean z4 = dg.e1.e(c1Var3.M1).k;
                int i10 = 0;
                while (true) {
                    List list = dg.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        dg.l lVar = (dg.l) list.get(i10);
                        int m9 = z4 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        bh.a aVar = new bh.a(c1Var3, lVar, m9, 3);
                        a1 a1Var = new a1(c1Var3, c1Var3.getContext());
                        a1Var.setIcon(m9);
                        a1Var.setText(n10);
                        a1Var.setSelected(false);
                        a1Var.setOnClickListener(new androidx.mediarouter.app.c(aVar, 2));
                        a1Var.setOnLongClickListener(new d0(c1Var3, 0));
                        c1Var3.P1.a(a1Var, c6.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
