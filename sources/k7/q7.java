package k7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class q7 {
    public static final sc.e a(Throwable exception) {
        kotlin.jvm.internal.j.e(exception, "exception");
        return new sc.e(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof sc.e) {
            throw ((sc.e) obj).a;
        }
    }
}
