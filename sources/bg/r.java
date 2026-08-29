package bg;

import i7.f6;
import java.util.List;
import org.telegram.ui.Components.p01;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;

    public /* synthetic */ r(g1 g1Var, int i10) {
        this.a = i10;
        this.b = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g1 g1Var = this.b;
                p01 p01Var = g1Var.W0;
                if (p01Var != null) {
                    g1Var.W0 = null;
                    g1Var.removeView(p01Var);
                    break;
                }
                break;
            case 1:
                g1 g1Var2 = this.b;
                if (g1Var2.A0 != null) {
                    g1Var2.C0.postRunnable(new r(g1Var2, 3), 200L);
                    break;
                }
                break;
            case 2:
                w2 w2Var = this.b.h1;
                if (w2Var != null) {
                    w2Var.invalidate();
                    break;
                }
                break;
            case 3:
                g1.a0(this.b);
                break;
            default:
                g1 g1Var3 = this.b;
                boolean z10 = ag.h1.e(g1Var3.L1).k;
                int i10 = 0;
                while (true) {
                    List list = ag.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        ag.l lVar = (ag.l) list.get(i10);
                        int m10 = z10 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        ag.v0 v0Var = new ag.v0(g1Var3, lVar, m10, 1);
                        e1 e1Var = new e1(g1Var3, g1Var3.getContext());
                        e1Var.setIcon(m10);
                        e1Var.setText(n10);
                        e1Var.setSelected(false);
                        e1Var.setOnClickListener(new ag.o(v0Var, 2));
                        e1Var.setOnLongClickListener(new g0(g1Var3, 0));
                        g1Var3.O1.a(e1Var, f6.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
