package i7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k3 implements r9.d {
    public static final k3 a = new k3();
    public static final r9.c b = new r9.c("maxMs", s3.c.h(i0.a.r(h0.class, new e0(1))));
    public static final r9.c c = new r9.c("minMs", s3.c.h(i0.a.r(h0.class, new e0(2))));
    public static final r9.c d = new r9.c("avgMs", s3.c.h(i0.a.r(h0.class, new e0(3))));
    public static final r9.c e = new r9.c("firstQuartileMs", s3.c.h(i0.a.r(h0.class, new e0(4))));
    public static final r9.c f = new r9.c("medianMs", s3.c.h(i0.a.r(h0.class, new e0(5))));
    public static final r9.c g = new r9.c("thirdQuartileMs", s3.c.h(i0.a.r(h0.class, new e0(6))));

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        f7 f7Var = (f7) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(b, f7Var.a);
        eVar.a(c, f7Var.b);
        eVar.a(d, f7Var.c);
        eVar.a(e, f7Var.d);
        eVar.a(f, f7Var.e);
        eVar.a(g, f7Var.f);
    }
}
