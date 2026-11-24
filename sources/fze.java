// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class fze {
    public static final Object a(ss9 ss9Var, ss9 ss9Var2, fs4 fs4Var) {
        Object qq2Var;
        Object C;
        try {
            r5c.a(2, fs4Var);
            qq2Var = fs4Var.invoke(ss9Var2, ss9Var);
        } catch (Throwable th) {
            qq2Var = new qq2(th, false);
        }
        ly2 ly2Var = ly2.a;
        if (qq2Var == ly2Var || (C = ss9Var.C(qq2Var)) == hcd.b) {
            return ly2Var;
        }
        if (C instanceof qq2) {
            throw ((qq2) C).a;
        }
        return hcd.a(C);
    }
}
