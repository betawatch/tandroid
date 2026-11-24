// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class nle {
    public static final void a(sw2 sw2Var) {
        bt5 bt5Var = (bt5) sw2Var.get(pd5.c);
        if (bt5Var != null && !bt5Var.isActive()) {
            throw bt5Var.getCancellationException();
        }
    }

    public static final bt5 b(sw2 sw2Var) {
        bt5 bt5Var = (bt5) sw2Var.get(pd5.c);
        if (bt5Var != null) {
            return bt5Var;
        }
        wn4.n(sw2Var, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final no3 c(bt5 bt5Var, boolean z, ft5 ft5Var) {
        return bt5Var instanceof pt5 ? ((pt5) bt5Var).z(z, ft5Var) : bt5Var.invokeOnCompletion(ft5Var.k(), z, new et5(1, ft5Var, ft5.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }
}
