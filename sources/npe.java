// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class npe {
    public static final void a(pfc pfcVar, op opVar, w26 w26Var) {
        AutoCloseable autoCloseable;
        opVar.getClass();
        w26Var.getClass();
        qfc qfcVar = pfcVar.a;
        synchronized (qfcVar.a) {
            autoCloseable = (AutoCloseable) qfcVar.b.get("androidx.lifecycle.savedstate.vm.tag");
        }
        yr9 yr9Var = (yr9) autoCloseable;
        if (yr9Var == null || yr9Var.c) {
            return;
        }
        yr9Var.a(opVar, w26Var);
        v26 v26Var = ((g36) w26Var).b;
        if (v26Var == v26.b || v26Var.compareTo(v26.d) >= 0) {
            opVar.g();
        } else {
            w26Var.a(new uc3(w26Var, opVar, (byte) 1));
        }
    }
}
