package k9;

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class n implements u9.d {
    public static final n a = new n();
    public static final u9.c b = u9.c.c(TeXSymbolParser.TYPE_ATTR);
    public static final u9.c c = u9.c.c("reason");
    public static final u9.c d = u9.c.c("frames");
    public static final u9.c e = u9.c.c("causedBy");
    public static final u9.c f = u9.c.c("overflowCount");

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        p0 p0Var = (p0) ((o1) obj);
        eVar.e(b, p0Var.a);
        eVar.e(c, p0Var.b);
        eVar.e(d, p0Var.c);
        eVar.e(e, p0Var.d);
        eVar.a(f, p0Var.e);
    }
}
