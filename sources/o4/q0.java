package o4;

import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements d1, e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ q0(h1 h1Var, int i3, int i10) {
        this.a = i10;
        this.b = h1Var;
        this.c = i3;
    }

    @Override // o4.d1
    public void b(l1 l1Var, v vVar) {
        switch (this.a) {
            case 0:
                l1Var.W(this.b.M0(vVar, l1Var, this.c));
                break;
            default:
                l1Var.O(this.b.M0(vVar, l1Var, this.c));
                break;
        }
    }

    @Override // o4.e1
    public void c(l1 l1Var, v vVar, List list) {
        switch (this.a) {
            case 1:
                l1Var.Z(this.b.M0(vVar, l1Var, this.c), list);
                break;
            case 2:
                h1 h1Var = this.b;
                h1Var.getClass();
                int size = list.size();
                int i3 = this.c;
                if (size != 1) {
                    l1Var.p0(list, h1Var.M0(vVar, l1Var, i3), h1Var.M0(vVar, l1Var, i3 + 1));
                    break;
                } else {
                    l1Var.n0(h1Var.M0(vVar, l1Var, i3), (d2.n0) list.get(0));
                    break;
                }
            default:
                l1Var.Z(this.b.M0(vVar, l1Var, this.c), list);
                break;
        }
    }
}
