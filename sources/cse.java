// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
