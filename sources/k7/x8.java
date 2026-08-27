package k7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class x8 implements r9.d {
    public static final x8 a = new x8();
    public static final r9.c b = new r9.c("isForegroundConfidenceMaskEnabled", s3.c.h(i0.a.s(w.class, new s(1))));
    public static final r9.c c = new r9.c("isForegroundBitmapEnabled", s3.c.h(i0.a.s(w.class, new s(2))));
    public static final r9.c d = new r9.c("isMultipleSubjectsEnabled", s3.c.h(i0.a.s(w.class, new s(3))));
    public static final r9.c e = new r9.c("isSubjectConfidenceMaskEnabled", s3.c.h(i0.a.s(w.class, new s(4))));
    public static final r9.c f = new r9.c("isSubjectBitmapEnabled", s3.c.h(i0.a.s(w.class, new s(5))));

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(b, veVar.a);
        eVar.a(c, veVar.b);
        eVar.a(d, veVar.c);
        eVar.a(e, veVar.d);
        eVar.a(f, veVar.e);
    }
}
