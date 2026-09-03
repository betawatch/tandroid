package k9;

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
