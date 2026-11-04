package n5;

import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d implements ma.d {
    public static final d a = new d();
    public static final ma.c b = new ma.c("logSource", p1.o(p1.n(pa.d.class, new pa.a(1))));
    public static final ma.c c = new ma.c("logEventDropped", p1.o(p1.n(pa.d.class, new pa.a(2))));

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        q5.e eVar = (q5.e) obj;
        ma.e eVar2 = (ma.e) obj2;
        eVar2.a(b, eVar.a);
        eVar2.a(c, eVar.b);
    }
}
