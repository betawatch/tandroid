// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
