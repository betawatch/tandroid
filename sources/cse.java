// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
