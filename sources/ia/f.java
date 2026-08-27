package ia;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f implements r9.d {
    public static final f a = new f();
    public static final r9.c b = r9.c.c("processName");
    public static final r9.c c = r9.c.c("pid");
    public static final r9.c d = r9.c.c("importance");
    public static final r9.c e = r9.c.c("defaultProcess");

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        r rVar = (r) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(b, rVar.a);
        eVar.d(c, rVar.b);
        eVar.d(d, rVar.c);
        eVar.g(e, rVar.d);
    }
}
