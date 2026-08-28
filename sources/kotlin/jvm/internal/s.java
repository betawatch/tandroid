package kotlin.jvm.internal;

import j3.r0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class s {
    public static void a(int i9, Object obj) {
        if (obj != null) {
            if (obj instanceof oc.a) {
                if ((obj instanceof f ? ((f) obj).getArity() : obj instanceof zc.a ? 0 : obj instanceof zc.l ? 1 : obj instanceof zc.p ? 2 : obj instanceof zc.q ? 3 : -1) == i9) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(aa.d.z(obj.getClass().getName(), " cannot be cast to ", r0.l(i9, "kotlin.jvm.functions.Function")));
            i.f(classCastException, s.class.getName());
            throw classCastException;
        }
    }
}
