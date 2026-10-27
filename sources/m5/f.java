package m5;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class f implements ka.d {
    public static final f a = new f();
    public static final ka.c b = new ka.c("currentCacheSizeBytes", ic.a.m(ic.a.l(na.d.class, new na.a(1))));
    public static final ka.c c = new ka.c("maxCacheSizeBytes", ic.a.m(ic.a.l(na.d.class, new na.a(2))));

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        p5.f fVar = (p5.f) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.f(b, fVar.a);
        eVar.f(c, fVar.b);
    }
}
