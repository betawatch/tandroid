package kotlin.jvm.internal;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class t {
    public static void a(int i10, Object obj) {
        if (obj != null) {
            if (obj instanceof pc.a) {
                if ((obj instanceof g ? ((g) obj).getArity() : obj instanceof ad.a ? 0 : obj instanceof ad.l ? 1 : obj instanceof ad.p ? 2 : obj instanceof ad.q ? 3 : -1) == i10) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(a9.p.w(obj.getClass().getName(), " cannot be cast to ", i0.a.k(i10, "kotlin.jvm.functions.Function")));
            j.f(classCastException, t.class.getName());
            throw classCastException;
        }
    }
}
