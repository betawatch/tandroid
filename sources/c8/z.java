package c8;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class z {
    public static final gd.f a(Throwable exception) {
        kotlin.jvm.internal.j.e(exception, "exception");
        return new gd.f(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof gd.f) {
            throw ((gd.f) obj).a;
        }
    }
}
