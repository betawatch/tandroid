package l5;

import hg.k0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class c implements ia.d {
    public static final c a = new c();
    public static final ia.c b = new ia.c("eventsDroppedCount", k0.m(k0.l(la.e.class, new la.a(1))));
    public static final ia.c c = new ia.c("reason", k0.m(k0.l(la.e.class, new la.a(3))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        o5.d dVar = (o5.d) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.f(b, dVar.a);
        eVar.a(c, dVar.b);
    }
}
