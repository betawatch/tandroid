package aa;

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class n implements ka.d {
    public static final n a = new n();
    public static final ka.c b = ka.c.c(TeXSymbolParser.TYPE_ATTR);
    public static final ka.c c = ka.c.c("reason");
    public static final ka.c d = ka.c.c("frames");
    public static final ka.c e = ka.c.c("causedBy");
    public static final ka.c f = ka.c.c("overflowCount");

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        ka.e eVar = (ka.e) obj2;
        r0 r0Var = (r0) ((q1) obj);
        eVar.a(b, r0Var.a);
        eVar.a(c, r0Var.b);
        eVar.a(d, r0Var.c);
        eVar.a(e, r0Var.d);
        eVar.e(f, r0Var.e);
    }
}
