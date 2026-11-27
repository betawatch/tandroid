// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class cse {
    public static final void a(nhc nhcVar, po poVar, a36 a36Var) {
        AutoCloseable autoCloseable;
        poVar.getClass();
        a36Var.getClass();
        ohc ohcVar = nhcVar.a;
        synchronized (ohcVar.a) {
            autoCloseable = (AutoCloseable) ohcVar.b.get("androidx.lifecycle.savedstate.vm.tag");
        }
        pt9 pt9Var = (pt9) autoCloseable;
        if (pt9Var == null || pt9Var.c) {
            return;
        }
        pt9Var.a(poVar, a36Var);
        z26 z26Var = ((k36) a36Var).b;
        if (z26Var == z26.b || z26Var.compareTo(z26.d) >= 0) {
            poVar.g();
        } else {
            a36Var.a(new bc3(a36Var, poVar, (byte) 1));
        }
    }
}
