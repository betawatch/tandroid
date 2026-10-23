package l5;

import i2.o1;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class f implements ja.d {
    public static final f a = new f();
    public static final ja.c b = new ja.c("currentCacheSizeBytes", o1.p(o1.o(ma.e.class, new ma.a(1))));
    public static final ja.c c = new ja.c("maxCacheSizeBytes", o1.p(o1.o(ma.e.class, new ma.a(2))));

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        o5.f fVar = (o5.f) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.f(b, fVar.a);
        eVar.f(c, fVar.b);
    }
}
