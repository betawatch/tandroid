package kh;

import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6 b;

    public /* synthetic */ x4(g6 g6Var, int i9) {
        this.a = i9;
        this.b = g6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yf.w1 w1Var = this.b.Z0;
                if (w1Var != null) {
                    w1Var.invalidate();
                    break;
                }
                break;
            case 1:
                new zf.x0((org.telegram.ui.ActionBar.o2) new bg.i1(this.b, 6), 14, true).show();
                break;
            case 2:
                this.b.z0(false);
                break;
            default:
                g6 g6Var = this.b;
                boolean z10 = xf.s0.e(g6Var.B1).k;
                int i9 = 0;
                while (true) {
                    List list = xf.l.b;
                    if (i9 >= list.size()) {
                        break;
                    } else {
                        xf.l lVar = (xf.l) list.get(i9);
                        int m10 = z10 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        d5.i iVar = new d5.i(g6Var, lVar, m10, 13);
                        d6 d6Var = new d6(g6Var, g6Var.getContext());
                        d6Var.setIcon(m10);
                        d6Var.setText(n10);
                        d6Var.setSelected(false);
                        d6Var.setOnClickListener(new androidx.mediarouter.app.c(iVar, 28));
                        d6Var.setOnLongClickListener(new d5(g6Var, 0));
                        g6Var.E1.a(d6Var, g7.e6.n(-1, 48));
                        i9++;
                    }
                }
        }
    }
}
