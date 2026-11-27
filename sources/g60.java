// default package

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class g60 implements zq7 {
    public static final g60 a = new g60();
    public static final sa4 b = sa4.c(TeXSymbolParser.TYPE_ATTR);
    public static final sa4 c = sa4.c("reason");
    public static final sa4 d = sa4.c("frames");
    public static final sa4 e = sa4.c("causedBy");
    public static final sa4 f = sa4.c("overflowCount");

    @Override // l34
    public final void a(Object obj, Object obj2) {
        mz2 mz2Var = (mz2) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, ((y80) mz2Var).a);
        y80 y80Var = (y80) mz2Var;
        ar7Var.a(c, y80Var.b);
        ar7Var.a(d, y80Var.c);
        ar7Var.a(e, y80Var.d);
        ar7Var.e(f, y80Var.e);
    }
}
