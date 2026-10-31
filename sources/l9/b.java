package l9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class b {
    public static final ad.f a(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        return new ad.f(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof ad.f) {
            throw ((ad.f) obj).a;
        }
    }
}
