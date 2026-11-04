package ca;

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p implements ma.d {
    public static final p a = new p();
    public static final ma.c b = ma.c.c(TeXSymbolParser.TYPE_ATTR);
    public static final ma.c c = ma.c.c("reason");
    public static final ma.c d = ma.c.c("frames");
    public static final ma.c e = ma.c.c("causedBy");
    public static final ma.c f = ma.c.c("overflowCount");

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        ma.e eVar = (ma.e) obj2;
        y0 y0Var = (y0) ((e2) obj);
        eVar.a(b, y0Var.a);
        eVar.a(c, y0Var.b);
        eVar.a(d, y0Var.c);
        eVar.a(e, y0Var.d);
        eVar.e(f, y0Var.e);
    }
}
