package l5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class f implements ia.d {
    public static final f a = new f();
    public static final ia.c b = new ia.c("currentCacheSizeBytes", hg.c.o(hg.c.n(la.e.class, new la.a(1))));
    public static final ia.c c = new ia.c("maxCacheSizeBytes", hg.c.o(hg.c.n(la.e.class, new la.a(2))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        o5.f fVar = (o5.f) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.f(b, fVar.a);
        eVar.f(c, fVar.b);
    }
}
