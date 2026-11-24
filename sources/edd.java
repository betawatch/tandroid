// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class edd {
    public static final lo5 a = new lo5("NO_THREAD_ELEMENTS");
    public static final dm2 b = new dm2(6);
    public static final dm2 c = new dm2(7);
    public static final dm2 d = new dm2(8);

    public static final void a(sw2 sw2Var, Object obj) {
        if (obj != a) {
            if (!(obj instanceof fnb)) {
                sw2Var.fold(null, c).getClass();
                fyb.g();
                return;
            }
            ow2[] ow2VarArr = ((fnb) obj).b;
            int length = ow2VarArr.length - 1;
            if (length < 0) {
                return;
            }
            ow2 ow2Var = ow2VarArr[length];
            throw null;
        }
    }

    public static final Object b(sw2 sw2Var) {
        Object fold = sw2Var.fold(0, b);
        fold.getClass();
        return fold;
    }

    public static final Object c(sw2 sw2Var, Object obj) {
        if (obj == null) {
            obj = b(sw2Var);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return sw2Var.fold(new fnb(((Number) obj).intValue(), sw2Var), d);
        }
        fyb.g();
        return null;
    }
}
