package l5;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class f implements ja.d {
    public static final f a = new f();
    public static final ja.c b = new ja.c("currentCacheSizeBytes", i2.e.o(i2.e.n(ma.e.class, new ma.a(1))));
    public static final ja.c c = new ja.c("maxCacheSizeBytes", i2.e.o(i2.e.n(ma.e.class, new ma.a(2))));

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        o5.f fVar = (o5.f) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.f(b, fVar.a);
        eVar.f(c, fVar.b);
    }
}
