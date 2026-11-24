// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
