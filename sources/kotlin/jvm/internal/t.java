package kotlin.jvm.internal;

import kh.a2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class t {
    public static void a(int i10, Object obj) {
        if (obj != null) {
            if (obj instanceof sc.a) {
                if ((obj instanceof g ? ((g) obj).getArity() : obj instanceof dd.a ? 0 : obj instanceof dd.l ? 1 : obj instanceof dd.p ? 2 : obj instanceof dd.q ? 3 : -1) == i10) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(android.support.v4.media.a.z(obj.getClass().getName(), " cannot be cast to ", a2.j(i10, "kotlin.jvm.functions.Function")));
            j.f(classCastException, t.class.getName());
            throw classCastException;
        }
    }
}
