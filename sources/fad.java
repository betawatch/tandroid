// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class fad {
    public static final lo5 a = new lo5("COMPLETING_ALREADY");
    public static final lo5 b = new lo5("COMPLETING_WAITING_CHILDREN");
    public static final lo5 c = new lo5("COMPLETING_RETRY");
    public static final lo5 d = new lo5("TOO_LATE_TO_CANCEL");
    public static final lo5 e = new lo5("SEALED");
    public static final v14 f = new v14(false);
    public static final v14 g = new v14(true);

    public static final Object a(Object obj) {
        fn5 fn5Var = obj instanceof fn5 ? (fn5) obj : null;
        return fn5Var != null ? fn5Var.a : obj;
    }
}
