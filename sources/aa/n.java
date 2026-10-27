package aa;

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
