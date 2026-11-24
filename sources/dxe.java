// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class dxe {
    public static final Object a(rq9 rq9Var, rq9 rq9Var2, eq4 eq4Var) {
        Object fp2Var;
        Object C;
        try {
            r3c.a(2, eq4Var);
            fp2Var = eq4Var.invoke(rq9Var2, rq9Var);
        } catch (Throwable th) {
            fp2Var = new fp2(th, false);
        }
        bx2 bx2Var = bx2.a;
        if (fp2Var == bx2Var || (C = rq9Var.C(fp2Var)) == fad.b) {
            return bx2Var;
        }
        if (C instanceof fp2) {
            throw ((fp2) C).a;
        }
        return fad.a(C);
    }
}
