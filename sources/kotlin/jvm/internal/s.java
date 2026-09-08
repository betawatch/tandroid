package kotlin.jvm.internal;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class s {
    public static void a(int i10, Object obj) {
        if (obj != null) {
            if (obj instanceof gd.a) {
                if ((obj instanceof f ? ((f) obj).getArity() : obj instanceof rd.a ? 0 : obj instanceof rd.l ? 1 : obj instanceof rd.p ? 2 : obj instanceof rd.q ? 3 : -1) == i10) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(a4.a.C(obj.getClass().getName(), " cannot be cast to ", i2.g.i(i10, "kotlin.jvm.functions.Function")));
            i.f(classCastException, s.class.getName());
            throw classCastException;
        }
    }
}
