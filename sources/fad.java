// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
