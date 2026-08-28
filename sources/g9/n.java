package g9;

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n implements q9.d {
    public static final n a = new n();
    public static final q9.c b = q9.c.c(TeXSymbolParser.TYPE_ATTR);
    public static final q9.c c = q9.c.c("reason");
    public static final q9.c d = q9.c.c("frames");
    public static final q9.c e = q9.c.c("causedBy");
    public static final q9.c f = q9.c.c("overflowCount");

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        q9.e eVar = (q9.e) obj2;
        p0 p0Var = (p0) ((o1) obj);
        eVar.g(b, p0Var.a);
        eVar.g(c, p0Var.b);
        eVar.g(d, p0Var.c);
        eVar.g(e, p0Var.d);
        eVar.c(f, p0Var.e);
    }
}
