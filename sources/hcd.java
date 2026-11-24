// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class hcd {
    public static final du2 a = new du2("COMPLETING_ALREADY", (byte) 2);
    public static final du2 b = new du2("COMPLETING_WAITING_CHILDREN", (byte) 2);
    public static final du2 c = new du2("COMPLETING_RETRY", (byte) 2);
    public static final du2 d = new du2("TOO_LATE_TO_CANCEL", (byte) 2);
    public static final du2 e = new du2("SEALED", (byte) 2);
    public static final g34 f = new g34(false);
    public static final g34 g = new g34(true);

    public static final Object a(Object obj) {
        fp5 fp5Var = obj instanceof fp5 ? (fp5) obj : null;
        return fp5Var != null ? fp5Var.a : obj;
    }
}
