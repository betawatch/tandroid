package kotlin.jvm.internal;

import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class u {
    public static void a(int i3, Object obj) {
        if (obj != null) {
            if (obj instanceof dd.a) {
                if ((obj instanceof g ? ((g) obj).getArity() : obj instanceof od.a ? 0 : obj instanceof od.l ? 1 : obj instanceof od.p ? 2 : obj instanceof od.q ? 3 : -1) == i3) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(a1.g.C(obj.getClass().getName(), " cannot be cast to ", p1.i(i3, "kotlin.jvm.functions.Function")));
            j.g(classCastException, u.class.getName());
            throw classCastException;
        }
    }
}
