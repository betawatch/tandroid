// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class gqe {
    public static final void a(mx2 mx2Var) {
        ev5 ev5Var = (ev5) mx2Var.get(qf5.c);
        if (ev5Var != null && !ev5Var.isActive()) {
            throw ev5Var.getCancellationException();
        }
    }

    public static final ev5 b(mx2 mx2Var) {
        ev5 ev5Var = (ev5) mx2Var.get(qf5.c);
        if (ev5Var != null) {
            return ev5Var;
        }
        lq5.i(mx2Var, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final ep3 c(ev5 ev5Var, boolean z, iv5 iv5Var) {
        return ev5Var instanceof sv5 ? ((sv5) ev5Var).z(z, iv5Var) : ev5Var.invokeOnCompletion(iv5Var.k(), z, new hv5(1, iv5Var, iv5.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }
}
