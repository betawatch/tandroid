package l5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class f implements ja.d {
    public static final f a = new f();
    public static final ja.c b = new ja.c("currentCacheSizeBytes", i2.d.o(i2.d.n(ma.e.class, new ma.a(1))));
    public static final ja.c c = new ja.c("maxCacheSizeBytes", i2.d.o(i2.d.n(ma.e.class, new ma.a(2))));

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        o5.f fVar = (o5.f) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.f(b, fVar.a);
        eVar.f(c, fVar.b);
    }
}
