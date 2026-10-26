package a8;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class h3 implements ka.d {
    public static final h3 a = new h3();
    public static final ka.c b = new ka.c("logEventKey", ic.a.m(a1.g.x(e0.class, new z(1))));
    public static final ka.c c = new ka.c("eventCount", ic.a.m(a1.g.x(e0.class, new z(2))));
    public static final ka.c d = new ka.c("inferenceDurationStats", ic.a.m(a1.g.x(e0.class, new z(3))));

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        s1 s1Var = (s1) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(b, s1Var.a);
        eVar.a(c, s1Var.b);
        eVar.a(d, s1Var.c);
    }
}
