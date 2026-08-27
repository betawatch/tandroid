package i7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t4 implements r9.d {
    public static final t4 a = new t4();
    public static final r9.c b = new r9.c("detectorOptions", s3.c.h(i0.a.r(h0.class, new e0(1))));
    public static final r9.c c = new r9.c("errorCodes", s3.c.h(i0.a.r(h0.class, new e0(2))));
    public static final r9.c d = new r9.c("totalInitializationMs", s3.c.h(i0.a.r(h0.class, new e0(3))));
    public static final r9.c e = new r9.c("loggingInitializationMs", s3.c.h(i0.a.r(h0.class, new e0(4))));
    public static final r9.c f = new r9.c("otherErrors", s3.c.h(i0.a.r(h0.class, new e0(5))));

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        l8 l8Var = (l8) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(b, l8Var.a);
        eVar.a(c, l8Var.b);
        eVar.a(d, null);
        eVar.a(e, null);
        eVar.a(f, null);
    }
}
