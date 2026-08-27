package k7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k4 implements r9.d {
    public static final k4 a = new k4();
    public static final r9.c b = new r9.c("maxMs", s3.c.h(i0.a.s(w.class, new s(1))));
    public static final r9.c c = new r9.c("minMs", s3.c.h(i0.a.s(w.class, new s(2))));
    public static final r9.c d = new r9.c("avgMs", s3.c.h(i0.a.s(w.class, new s(3))));
    public static final r9.c e = new r9.c("firstQuartileMs", s3.c.h(i0.a.s(w.class, new s(4))));
    public static final r9.c f = new r9.c("medianMs", s3.c.h(i0.a.s(w.class, new s(5))));
    public static final r9.c g = new r9.c("thirdQuartileMs", s3.c.h(i0.a.s(w.class, new s(6))));

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(b, maVar.a);
        eVar.a(c, maVar.b);
        eVar.a(d, maVar.c);
        eVar.a(e, maVar.d);
        eVar.a(f, maVar.e);
        eVar.a(g, maVar.f);
    }
}
