package l5;

import hg.k0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class d implements ia.d {
    public static final d a = new d();
    public static final ia.c b = new ia.c("logSource", k0.m(k0.l(la.e.class, new la.a(1))));
    public static final ia.c c = new ia.c("logEventDropped", k0.m(k0.l(la.e.class, new la.a(2))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        o5.e eVar = (o5.e) obj;
        ia.e eVar2 = (ia.e) obj2;
        eVar2.a(b, eVar.a);
        eVar2.a(c, eVar.b);
    }
}
