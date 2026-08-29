package kotlin.jvm.internal;

import a4.w;
import j7.l1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class t {
    public static void a(int i10, Object obj) {
        if (obj != null) {
            if (obj instanceof qc.a) {
                if ((obj instanceof g ? ((g) obj).getArity() : obj instanceof bd.a ? 0 : obj instanceof bd.l ? 1 : obj instanceof bd.p ? 2 : obj instanceof bd.q ? 3 : -1) == i10) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(w.y(obj.getClass().getName(), " cannot be cast to ", l1.k(i10, "kotlin.jvm.functions.Function")));
            j.f(classCastException, t.class.getName());
            throw classCastException;
        }
    }
}
