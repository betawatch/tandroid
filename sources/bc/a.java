package bc;

import bi.u6;
import qb.g;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements q9.d {
    public static final /* synthetic */ a b = new a(0);
    public static final /* synthetic */ a c = new a(1);
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // q9.d
    public final Object P1(u6 u6Var) {
        switch (this.a) {
            case 0:
                return new c((g) u6Var.a(g.class));
            default:
                return new b((c) u6Var.a(c.class), (qb.d) u6Var.a(qb.d.class));
        }
    }
}
