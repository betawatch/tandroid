package l5;

import hg.k0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class f implements ia.d {
    public static final f a = new f();
    public static final ia.c b = new ia.c("currentCacheSizeBytes", k0.m(k0.l(la.e.class, new la.a(1))));
    public static final ia.c c = new ia.c("maxCacheSizeBytes", k0.m(k0.l(la.e.class, new la.a(2))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        o5.f fVar = (o5.f) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.f(b, fVar.a);
        eVar.f(c, fVar.b);
    }
}
