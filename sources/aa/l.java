package aa;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class l implements ka.d {
    public static final l a = new l();
    public static final ka.c b = ka.c.c("baseAddress");
    public static final ka.c c = ka.c.c("size");
    public static final ka.c d = ka.c.c("name");
    public static final ka.c e = ka.c.c("uuid");

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        ka.e eVar = (ka.e) obj2;
        q0 q0Var = (q0) ((p1) obj);
        eVar.f(b, q0Var.a);
        eVar.f(c, q0Var.b);
        eVar.a(d, q0Var.c);
        String str = q0Var.d;
        eVar.a(e, str != null ? str.getBytes(g2.a) : null);
    }
}
