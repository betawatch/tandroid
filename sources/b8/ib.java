package b8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class ib {
    public static final dd.f a(Throwable exception) {
        kotlin.jvm.internal.j.e(exception, "exception");
        return new dd.f(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof dd.f) {
            throw ((dd.f) obj).a;
        }
    }
}
