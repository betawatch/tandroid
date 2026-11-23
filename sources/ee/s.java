package ee;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
