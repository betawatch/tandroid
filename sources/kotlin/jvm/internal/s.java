package kotlin.jvm.internal;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class s {
    public static void a(int i10, Object obj) {
        if (obj != null) {
            if (obj instanceof ad.a) {
                if ((obj instanceof f ? ((f) obj).getArity() : obj instanceof ld.a ? 0 : obj instanceof ld.l ? 1 : obj instanceof ld.p ? 2 : obj instanceof ld.q ? 3 : -1) == i10) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(a1.g.C(obj.getClass().getName(), " cannot be cast to ", i0.a.i(i10, "kotlin.jvm.functions.Function")));
            i.f(classCastException, s.class.getName());
            throw classCastException;
        }
    }
}
