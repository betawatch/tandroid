package bc;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
