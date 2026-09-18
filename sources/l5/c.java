package l5;

import hg.k0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
