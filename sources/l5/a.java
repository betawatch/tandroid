package l5;

import hg.k0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class a implements ia.d {
    public static final a a = new a();
    public static final ia.c b = new ia.c("window", k0.m(k0.l(la.e.class, new la.a(1))));
    public static final ia.c c = new ia.c("logSourceMetrics", k0.m(k0.l(la.e.class, new la.a(2))));
    public static final ia.c d = new ia.c("globalMetrics", k0.m(k0.l(la.e.class, new la.a(3))));
    public static final ia.c e = new ia.c("appNamespace", k0.m(k0.l(la.e.class, new la.a(4))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        o5.a aVar = (o5.a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, aVar.a);
        eVar.a(c, aVar.b);
        eVar.a(d, aVar.c);
        eVar.a(e, aVar.d);
    }
}
