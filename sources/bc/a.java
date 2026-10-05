package bc;

import qb.g;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements q9.d {
    public static final /* synthetic */ a b = new a(0);
    public static final /* synthetic */ a c = new a(1);
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // q9.d
    public final Object E(cf.c cVar) {
        switch (this.a) {
            case 0:
                return new c((g) cVar.a(g.class));
            default:
                return new b((c) cVar.a(c.class), (qb.d) cVar.a(qb.d.class));
        }
    }
}
