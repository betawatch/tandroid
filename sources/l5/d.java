package l5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class d implements ia.d {
    public static final d a = new d();
    public static final ia.c b = new ia.c("logSource", i2.g.n(i2.g.m(la.e.class, new la.a(1))));
    public static final ia.c c = new ia.c("logEventDropped", i2.g.n(i2.g.m(la.e.class, new la.a(2))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        o5.e eVar = (o5.e) obj;
        ia.e eVar2 = (ia.e) obj2;
        eVar2.a(b, eVar.a);
        eVar2.a(c, eVar.b);
    }
}
