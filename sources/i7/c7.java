package i7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class c7 {
    public static final qc.e a(Throwable exception) {
        kotlin.jvm.internal.j.e(exception, "exception");
        return new qc.e(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof qc.e) {
            throw ((qc.e) obj).a;
        }
    }
}
