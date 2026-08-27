package k7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class y2 implements r9.d {
    public static final y2 a = new y2();
    public static final r9.c b = new r9.c("logEventKey", s3.c.h(i0.a.s(w.class, new s(1))));
    public static final r9.c c = new r9.c("eventCount", s3.c.h(i0.a.s(w.class, new s(2))));
    public static final r9.c d = new r9.c("inferenceDurationStats", s3.c.h(i0.a.s(w.class, new s(3))));

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        j1 j1Var = (j1) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(b, j1Var.a);
        eVar.a(c, j1Var.b);
        eVar.a(d, j1Var.c);
    }
}
