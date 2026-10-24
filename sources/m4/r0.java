package m4;

import java.util.List;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements e1, f1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ r0(i1 i1Var, int i10, int i11) {
        this.a = i11;
        this.b = i1Var;
        this.c = i10;
    }

    @Override // m4.f1
    public void b(m1 m1Var, v vVar, List list) {
        switch (this.a) {
            case 1:
                m1Var.b0(this.b.K0(vVar, m1Var, this.c), list);
                break;
            case 2:
                i1 i1Var = this.b;
                i1Var.getClass();
                int size = list.size();
                int i10 = this.c;
                if (size != 1) {
                    m1Var.O(i1Var.K0(vVar, m1Var, i10), i1Var.K0(vVar, m1Var, i10 + 1), list);
                    break;
                } else {
                    m1Var.u0((b2.o0) list.get(0), i1Var.K0(vVar, m1Var, i10));
                    break;
                }
            default:
                m1Var.b0(this.b.K0(vVar, m1Var, this.c), list);
                break;
        }
    }

    @Override // m4.e1
    public void c(m1 m1Var, v vVar) {
        switch (this.a) {
            case 0:
                m1Var.Y(this.b.K0(vVar, m1Var, this.c));
                break;
            default:
                m1Var.Q(this.b.K0(vVar, m1Var, this.c));
                break;
        }
    }
}
