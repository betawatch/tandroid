package nh;

import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;

    public /* synthetic */ p4(t5 t5Var, int i10) {
        this.a = i10;
        this.b = t5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bg.w2 w2Var = this.b.Z0;
                if (w2Var != null) {
                    w2Var.invalidate();
                    break;
                }
                break;
            case 1:
                new cg.p1((org.telegram.ui.ActionBar.o2) new cg.z1(this.b, 7), 14, true).show();
                break;
            case 2:
                this.b.z0(false);
                break;
            default:
                t5 t5Var = this.b;
                boolean z10 = ag.h1.e(t5Var.B1).k;
                int i10 = 0;
                while (true) {
                    List list = ag.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        ag.l lVar = (ag.l) list.get(i10);
                        int m10 = z10 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        ag.v0 v0Var = new ag.v0(t5Var, lVar, m10, 15);
                        r5 r5Var = new r5(t5Var, t5Var.getContext());
                        r5Var.setIcon(m10);
                        r5Var.setText(n10);
                        r5Var.setSelected(false);
                        r5Var.setOnClickListener(new mh.n(v0Var, 4));
                        r5Var.setOnLongClickListener(new bg.g0(t5Var, 1));
                        t5Var.E1.a(r5Var, i7.f6.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
