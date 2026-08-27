package h9;

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n implements r9.d {
    public static final n a = new n();
    public static final r9.c b = r9.c.c(TeXSymbolParser.TYPE_ATTR);
    public static final r9.c c = r9.c.c("reason");
    public static final r9.c d = r9.c.c("frames");
    public static final r9.c e = r9.c.c("causedBy");
    public static final r9.c f = r9.c.c("overflowCount");

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        r9.e eVar = (r9.e) obj2;
        p0 p0Var = (p0) ((o1) obj);
        eVar.a(b, p0Var.a);
        eVar.a(c, p0Var.b);
        eVar.a(d, p0Var.c);
        eVar.a(e, p0Var.d);
        eVar.d(f, p0Var.e);
    }
}
