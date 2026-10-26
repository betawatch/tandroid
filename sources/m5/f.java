package m5;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
