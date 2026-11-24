// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class kud {
    public static qw2 a(qw2 qw2Var, rw2 rw2Var) {
        rw2Var.getClass();
        if (rp5.a(qw2Var.getKey(), rw2Var)) {
            return qw2Var;
        }
        return null;
    }

    public static sw2 b(qw2 qw2Var, rw2 rw2Var) {
        rw2Var.getClass();
        return rp5.a(qw2Var.getKey(), rw2Var) ? z14.a : qw2Var;
    }

    public static sw2 c(qw2 qw2Var, sw2 sw2Var) {
        sw2Var.getClass();
        return sw2Var == z14.a ? qw2Var : (sw2) sw2Var.fold(qw2Var, new dm2((byte) 1));
    }
}
