// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class eee {
    public static final void a(na1 na1Var, fw2 fw2Var, boolean z) {
        Object r = na1Var.r();
        Throwable f = na1Var.f(r);
        Object sa9Var = f != null ? new sa9(f) : na1Var.g(r);
        if (!z) {
            fw2Var.resumeWith(sa9Var);
            return;
        }
        fw2Var.getClass();
        ho3 ho3Var = (ho3) fw2Var;
        gw2 gw2Var = ho3Var.e;
        Object obj = ho3Var.h;
        sw2 context = gw2Var.getContext();
        Object c = edd.c(context, obj);
        y4c c2 = c != edd.a ? qzd.c(gw2Var, context, c) : null;
        try {
            gw2Var.resumeWith(sa9Var);
            if (c2 == null || c2.S()) {
                edd.a(context, c);
            }
        } catch (Throwable th) {
            if (c2 == null || c2.S()) {
                edd.a(context, c);
            }
            throw th;
        }
    }
}
