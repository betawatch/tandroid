package fi;

import java.util.List;
import org.telegram.ui.Components.gb1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;

    public /* synthetic */ v4(e6 e6Var, int i10) {
        this.a = i10;
        this.b = e6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sg.y1 y1Var = this.b.S0;
                if (y1Var != null) {
                    y1Var.invalidate();
                    break;
                }
                break;
            case 1:
                new tg.y0((org.telegram.ui.ActionBar.r2) new bi.v4(this.b, 4), 14, true).show();
                break;
            case 2:
                this.b.w0(false);
                break;
            default:
                e6 e6Var = this.b;
                boolean z10 = rg.s0.e(e6Var.u1).k;
                int i10 = 0;
                while (true) {
                    List list = rg.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        rg.l lVar = (rg.l) list.get(i10);
                        int m10 = z10 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        ai.h0 h0Var = new ai.h0(e6Var, lVar, m10, 12);
                        b6 b6Var = new b6(e6Var, e6Var.getContext());
                        b6Var.setIcon(m10);
                        b6Var.setText(n10);
                        b6Var.setSelected(false);
                        b6Var.setOnClickListener(new ai.s(h0Var, 22));
                        b6Var.setOnLongClickListener(new b5(e6Var, 0));
                        e6Var.x1.a(b6Var, gb1.r(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
