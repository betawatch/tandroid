package kotlin.jvm.internal;

import i2.o1;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public abstract class s {
    public static void a(int i10, Object obj) {
        if (obj != null) {
            if (obj instanceof id.a) {
                if ((obj instanceof f ? ((f) obj).getArity() : obj instanceof td.a ? 0 : obj instanceof td.l ? 1 : obj instanceof td.p ? 2 : obj instanceof td.q ? 3 : -1) == i10) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(a1.g.D(obj.getClass().getName(), " cannot be cast to ", o1.k(i10, "kotlin.jvm.functions.Function")));
            i.f(classCastException, s.class.getName());
            throw classCastException;
        }
    }
}
