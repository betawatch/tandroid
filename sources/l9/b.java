package l9;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
