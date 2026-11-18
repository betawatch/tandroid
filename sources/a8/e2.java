package a8;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class e2 implements na.d {
    public static final e2 a = new e2();
    public static final na.c b = new na.c("logEventKey", i5.c.p(p0.w(n0.class, new j0(1))));
    public static final na.c c = new na.c("eventCount", i5.c.p(p0.w(n0.class, new j0(2))));
    public static final na.c d = new na.c("inferenceDurationStats", i5.c.p(p0.w(n0.class, new j0(3))));

    @Override // na.a
    public final void a(Object obj, Object obj2) {
        f1 f1Var = (f1) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(b, f1Var.a);
        eVar.a(c, f1Var.b);
        eVar.a(d, f1Var.c);
    }
}
