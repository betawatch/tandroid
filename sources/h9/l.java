package h9;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l implements r9.d {
    public static final l a = new l();
    public static final r9.c b = r9.c.c("baseAddress");
    public static final r9.c c = r9.c.c("size");
    public static final r9.c d = r9.c.c("name");
    public static final r9.c e = r9.c.c("uuid");

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        r9.e eVar = (r9.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.c(b, o0Var.a);
        eVar.c(c, o0Var.b);
        eVar.a(d, o0Var.c);
        String str = o0Var.d;
        eVar.a(e, str != null ? str.getBytes(e2.a) : null);
    }
}
