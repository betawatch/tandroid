package he;

import a8.jd;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class u {
    public static final /* synthetic */ int a = 0;

    static {
        Object a2;
        Object a10;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            a2 = nd.a.class.getCanonicalName();
        } catch (Throwable th2) {
            a2 = jd.a(th2);
        }
        if (jd.f.a(a2) != null) {
            a2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            a10 = u.class.getCanonicalName();
        } catch (Throwable th3) {
            a10 = jd.a(th3);
        }
        if (jd.f.a(a10) != null) {
            a10 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
