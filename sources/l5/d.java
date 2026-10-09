package l5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class d implements ia.d {
    public static final d a = new d();
    public static final ia.c b = new ia.c("logSource", hg.c.m(hg.c.l(la.e.class, new la.a(1))));
    public static final ia.c c = new ia.c("logEventDropped", hg.c.m(hg.c.l(la.e.class, new la.a(2))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        o5.e eVar = (o5.e) obj;
        ia.e eVar2 = (ia.e) obj2;
        eVar2.a(b, eVar.a);
        eVar2.a(c, eVar.b);
    }
}
