package ee;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class s {
    public static final /* synthetic */ int a = 0;

    static {
        Object b10;
        Object b11;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            b10 = kd.a.class.getCanonicalName();
        } catch (Throwable th2) {
            b10 = af.b.b(th2);
        }
        if (gd.g.a(b10) != null) {
            b10 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            b11 = s.class.getCanonicalName();
        } catch (Throwable th3) {
            b11 = af.b.b(th3);
        }
        if (gd.g.a(b11) != null) {
            b11 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
