package ee;

import v7.t7;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
            a2 = kd.a.class.getCanonicalName();
        } catch (Throwable th2) {
            a2 = t7.a(th2);
        }
        if (gd.f.a(a2) != null) {
            a2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            a10 = u.class.getCanonicalName();
        } catch (Throwable th3) {
            a10 = t7.a(th3);
        }
        if (gd.f.a(a10) != null) {
            a10 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
