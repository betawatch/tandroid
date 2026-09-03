package kotlin.jvm.internal;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class t {
    public static void a(int i10, Object obj) {
        if (obj != null) {
            if (obj instanceof sc.a) {
                if ((obj instanceof g ? ((g) obj).getArity() : obj instanceof dd.a ? 0 : obj instanceof dd.l ? 1 : obj instanceof dd.p ? 2 : obj instanceof dd.q ? 3 : -1) == i10) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(android.support.v4.media.a.z(obj.getClass().getName(), " cannot be cast to ", l.d.j(i10, "kotlin.jvm.functions.Function")));
            j.f(classCastException, t.class.getName());
            throw classCastException;
        }
    }
}
