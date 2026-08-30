package k7;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class p7 {
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
