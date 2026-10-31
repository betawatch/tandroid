package kotlin.jvm.internal;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
