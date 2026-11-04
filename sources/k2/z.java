package k2;

import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements g2.p, o4.f1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ z(int i3, g9.s1 s1Var) {
        this.a = i3;
        this.b = s1Var;
    }

    @Override // o4.f1
    public Object i(o4.e0 e0Var, o4.v vVar, int i3) {
        switch (this.a) {
        }
        return e0Var.l(vVar, this.b);
    }

    @Override // g2.p
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((d2.c1) obj).F(this.b);
                break;
            default:
                ((l2.b) obj).getClass();
                break;
        }
    }

    public /* synthetic */ z(l2.a aVar, List list) {
        this.a = 1;
        this.b = list;
    }
}
