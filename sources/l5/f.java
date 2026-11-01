package l5;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class f implements ja.d {
    public static final f a = new f();
    public static final ja.c b = new ja.c("currentCacheSizeBytes", i0.a.o(i0.a.n(ma.e.class, new ma.a(1))));
    public static final ja.c c = new ja.c("maxCacheSizeBytes", i0.a.o(i0.a.n(ma.e.class, new ma.a(2))));

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        o5.f fVar = (o5.f) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.f(b, fVar.a);
        eVar.f(c, fVar.b);
    }
}
