package l5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
