package l5;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class f implements ia.d {
    public static final f a = new f();
    public static final ia.c b = new ia.c("currentCacheSizeBytes", i2.g.n(i2.g.m(la.e.class, new la.a(1))));
    public static final ia.c c = new ia.c("maxCacheSizeBytes", i2.g.n(i2.g.m(la.e.class, new la.a(2))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        o5.f fVar = (o5.f) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.f(b, fVar.a);
        eVar.f(c, fVar.b);
    }
}
