package cc;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public abstract class h extends Exception {
    public static final boolean a;
    public static final StackTraceElement[] b;

    static {
        a = System.getProperty("surefire.test.class.path") != null;
        b = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
