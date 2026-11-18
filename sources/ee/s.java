package ee;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class s {
    public static final /* synthetic */ int a = 0;

    static {
        Object a10;
        Object a11;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            a10 = kd.a.class.getCanonicalName();
        } catch (Throwable th2) {
            a10 = b7.h.a(th2);
        }
        if (gd.g.a(a10) != null) {
            a10 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            a11 = s.class.getCanonicalName();
        } catch (Throwable th3) {
            a11 = b7.h.a(th3);
        }
        if (gd.g.a(a11) != null) {
            a11 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
