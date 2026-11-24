// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class kne {
    public static final void a(odc odcVar, oo ooVar, w06 w06Var) {
        AutoCloseable autoCloseable;
        ooVar.getClass();
        w06Var.getClass();
        pdc pdcVar = odcVar.a;
        synchronized (pdcVar.a) {
            autoCloseable = (AutoCloseable) pdcVar.b.get("androidx.lifecycle.savedstate.vm.tag");
        }
        xp9 xp9Var = (xp9) autoCloseable;
        if (xp9Var == null || xp9Var.c) {
            return;
        }
        xp9Var.a(ooVar, w06Var);
        v06 v06Var = ((g16) w06Var).b;
        if (v06Var == v06.b || v06Var.compareTo(v06.d) >= 0) {
            ooVar.g();
        } else {
            w06Var.a(new ib3(w06Var, ooVar, (byte) 1));
        }
    }
}
