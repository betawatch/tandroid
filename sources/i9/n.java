package i9;

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n implements s9.d {
    public static final n a = new n();
    public static final s9.c b = s9.c.c(TeXSymbolParser.TYPE_ATTR);
    public static final s9.c c = s9.c.c("reason");
    public static final s9.c d = s9.c.c("frames");
    public static final s9.c e = s9.c.c("causedBy");
    public static final s9.c f = s9.c.c("overflowCount");

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        s9.e eVar = (s9.e) obj2;
        p0 p0Var = (p0) ((o1) obj);
        eVar.e(b, p0Var.a);
        eVar.e(c, p0Var.b);
        eVar.e(d, p0Var.c);
        eVar.e(e, p0Var.d);
        eVar.b(f, p0Var.e);
    }
}
