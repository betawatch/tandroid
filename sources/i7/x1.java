package i7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class x1 implements r9.d {
    public static final x1 a = new x1();
    public static final r9.c b = new r9.c("logEventKey", s3.c.h(i0.a.r(h0.class, new e0(1))));
    public static final r9.c c = new r9.c("eventCount", s3.c.h(i0.a.r(h0.class, new e0(2))));
    public static final r9.c d = new r9.c("inferenceDurationStats", s3.c.h(i0.a.r(h0.class, new e0(3))));

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        x0 x0Var = (x0) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(b, x0Var.a);
        eVar.a(c, x0Var.b);
        eVar.a(d, x0Var.c);
    }
}
