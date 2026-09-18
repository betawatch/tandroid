package bc;

import qb.g;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
