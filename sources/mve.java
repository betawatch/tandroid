// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class mve {
    public static final Object a(long j, eq4 eq4Var, fw2 fw2Var) {
        Object fp2Var;
        Object C;
        if (j <= 0) {
            throw new mob("Timed out immediately", null);
        }
        nob nobVar = new nob(j, fw2Var);
        nle.c(nobVar, true, new oo3(jde.b(nobVar.e.getContext()).a(nobVar.f, nobVar, nobVar.d)));
        try {
            r3c.a(2, eq4Var);
            fp2Var = eq4Var.invoke(nobVar, nobVar);
        } catch (Throwable th) {
            fp2Var = new fp2(th, false);
        }
        Object obj = bx2.a;
        if (fp2Var == obj || (C = nobVar.C(fp2Var)) == fad.b) {
            return obj;
        }
        if (C instanceof fp2) {
            Throwable th2 = ((fp2) C).a;
            if (!(th2 instanceof mob)) {
                throw th2;
            }
            if (((mob) th2).a != nobVar) {
                throw th2;
            }
            if (fp2Var instanceof fp2) {
                throw ((fp2) fp2Var).a;
            }
        } else {
            fp2Var = fad.a(C);
        }
        return fp2Var;
    }
}
