package da;

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
