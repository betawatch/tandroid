package kotlin.jvm.internal;

import a8.p0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class u {
    public static void a(int i7, Object obj) {
        if (obj != null) {
            if (obj instanceof gd.a) {
                if ((obj instanceof g ? ((g) obj).getArity() : obj instanceof rd.a ? 0 : obj instanceof rd.l ? 1 : obj instanceof rd.p ? 2 : obj instanceof rd.q ? 3 : -1) == i7) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(p0.D(obj.getClass().getName(), " cannot be cast to ", jg.g.j(i7, "kotlin.jvm.functions.Function")));
            j.g(classCastException, u.class.getName());
            throw classCastException;
        }
    }
}
