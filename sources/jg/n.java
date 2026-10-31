package jg;

import java.util.List;
import org.telegram.ui.Components.h01;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ n(r0 r0Var, int i10) {
        this.a = i10;
        this.b = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r0 r0Var = this.b;
                h01 h01Var = r0Var.J0;
                if (h01Var != null) {
                    r0Var.J0 = null;
                    r0Var.removeView(h01Var);
                    break;
                }
                break;
            case 1:
                r0 r0Var2 = this.b;
                if (r0Var2.n0 != null) {
                    r0Var2.p0.postRunnable(new n(r0Var2, 3), 200L);
                    break;
                }
                break;
            case 2:
                d2 d2Var = this.b.U0;
                if (d2Var != null) {
                    d2Var.invalidate();
                    break;
                }
                break;
            case 3:
                r0.Y(this.b);
                break;
            default:
                r0 r0Var3 = this.b;
                boolean z10 = ig.s0.e(r0Var3.y1).k;
                int i10 = 0;
                while (true) {
                    List list = ig.g.c;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        ig.g gVar = (ig.g) list.get(i10);
                        int m10 = z10 ? gVar.m() : gVar.e();
                        String n10 = gVar.n();
                        ag.o0 o0Var = new ag.o0(r0Var3, gVar, m10, 7);
                        p0 p0Var = new p0(r0Var3, r0Var3.getContext());
                        p0Var.setIcon(m10);
                        p0Var.setText(n10);
                        p0Var.setSelected(false);
                        p0Var.setOnClickListener(new ag.g(o0Var, 9));
                        p0Var.setOnLongClickListener(new bi.h1(r0Var3, 4));
                        r0Var3.B1.a(p0Var, b6.o(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
