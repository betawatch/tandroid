package aa;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
