package kotlin.jvm.internal;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class s {
    public static void a(int i10, Object obj) {
        if (obj != null) {
            if (obj instanceof jd.a) {
                if ((obj instanceof f ? ((f) obj).getArity() : obj instanceof ud.a ? 0 : obj instanceof ud.l ? 1 : obj instanceof ud.p ? 2 : obj instanceof ud.q ? 3 : -1) == i10) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(a1.g.D(obj.getClass().getName(), " cannot be cast to ", ic.a.i(i10, "kotlin.jvm.functions.Function")));
            i.f(classCastException, s.class.getName());
            throw classCastException;
        }
    }
}
