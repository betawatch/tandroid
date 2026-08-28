package g9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l implements q9.d {
    public static final l a = new l();
    public static final q9.c b = q9.c.c("baseAddress");
    public static final q9.c c = q9.c.c("size");
    public static final q9.c d = q9.c.c("name");
    public static final q9.c e = q9.c.c("uuid");

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        q9.e eVar = (q9.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.d(b, o0Var.a);
        eVar.d(c, o0Var.b);
        eVar.g(d, o0Var.c);
        String str = o0Var.d;
        eVar.g(e, str != null ? str.getBytes(e2.a) : null);
    }
}
