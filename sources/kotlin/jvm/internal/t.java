package kotlin.jvm.internal;

import kf.k0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class t {
    public static void a(int i10, Object obj) {
        if (obj != null) {
            if (obj instanceof sc.a) {
                if ((obj instanceof g ? ((g) obj).getArity() : obj instanceof dd.a ? 0 : obj instanceof dd.l ? 1 : obj instanceof dd.p ? 2 : obj instanceof dd.q ? 3 : -1) == i10) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(android.support.v4.media.a.z(obj.getClass().getName(), " cannot be cast to ", k0.j(i10, "kotlin.jvm.functions.Function")));
            j.f(classCastException, t.class.getName());
            throw classCastException;
        }
    }
}
