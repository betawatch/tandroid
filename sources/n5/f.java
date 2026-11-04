package n5;

import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f implements ma.d {
    public static final f a = new f();
    public static final ma.c b = new ma.c("currentCacheSizeBytes", p1.o(p1.n(pa.d.class, new pa.a(1))));
    public static final ma.c c = new ma.c("maxCacheSizeBytes", p1.o(p1.n(pa.d.class, new pa.a(2))));

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        q5.f fVar = (q5.f) obj;
        ma.e eVar = (ma.e) obj2;
        eVar.f(b, fVar.a);
        eVar.f(c, fVar.b);
    }
}
