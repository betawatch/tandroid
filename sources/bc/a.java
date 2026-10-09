package bc;

import ci.u5;
import qb.g;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements q9.d {
    public static final /* synthetic */ a b = new a(0);
    public static final /* synthetic */ a c = new a(1);
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // q9.d
    public final Object y0(u5 u5Var) {
        switch (this.a) {
            case 0:
                return new c((g) u5Var.a(g.class));
            default:
                return new b((c) u5Var.a(c.class), (qb.d) u5Var.a(qb.d.class));
        }
    }
}
