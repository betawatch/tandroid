package l5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class f implements ia.d {
    public static final f a = new f();
    public static final ia.c b = new ia.c("currentCacheSizeBytes", hg.c.m(hg.c.l(la.e.class, new la.a(1))));
    public static final ia.c c = new ia.c("maxCacheSizeBytes", hg.c.m(hg.c.l(la.e.class, new la.a(2))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        o5.f fVar = (o5.f) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.f(b, fVar.a);
        eVar.f(c, fVar.b);
    }
}
