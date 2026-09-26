package bc;

import qb.g;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements q9.d {
    public static final /* synthetic */ a b = new a(0);
    public static final /* synthetic */ a c = new a(1);
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // q9.d
    public final Object G(cf.c cVar) {
        switch (this.a) {
            case 0:
                return new c((g) cVar.a(g.class));
            default:
                return new b((c) cVar.a(c.class), (qb.d) cVar.a(qb.d.class));
        }
    }
}
