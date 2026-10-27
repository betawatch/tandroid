package a8;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class jd {
    public static final jd.e a(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        return new jd.e(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof jd.e) {
            throw ((jd.e) obj).a;
        }
    }
}
