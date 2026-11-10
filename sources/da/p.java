package da;

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class p implements na.d {
    public static final p a = new p();
    public static final na.c b = na.c.c(TeXSymbolParser.TYPE_ATTR);
    public static final na.c c = na.c.c("reason");
    public static final na.c d = na.c.c("frames");
    public static final na.c e = na.c.c("causedBy");
    public static final na.c f = na.c.c("overflowCount");

    @Override // na.a
    public final void a(Object obj, Object obj2) {
        na.e eVar = (na.e) obj2;
        y0 y0Var = (y0) ((e2) obj);
        eVar.a(b, y0Var.a);
        eVar.a(c, y0Var.b);
        eVar.a(d, y0Var.c);
        eVar.a(e, y0Var.d);
        eVar.d(f, y0Var.e);
    }
}
