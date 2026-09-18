package l5;

import hg.k0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class d implements ia.d {
    public static final d a = new d();
    public static final ia.c b = new ia.c("logSource", k0.o(k0.n(la.e.class, new la.a(1))));
    public static final ia.c c = new ia.c("logEventDropped", k0.o(k0.n(la.e.class, new la.a(2))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        o5.e eVar = (o5.e) obj;
        ia.e eVar2 = (ia.e) obj2;
        eVar2.a(b, eVar.a);
        eVar2.a(c, eVar.b);
    }
}
