package kotlin.jvm.internal;

import hg.k0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public abstract class s {
    public static void a(int i10, Object obj) {
        if (obj != null) {
            if (obj instanceof gd.a) {
                if ((obj instanceof f ? ((f) obj).getArity() : obj instanceof rd.a ? 0 : obj instanceof rd.l ? 1 : obj instanceof rd.p ? 2 : obj instanceof rd.q ? 3 : -1) == i10) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(a4.a.C(obj.getClass().getName(), " cannot be cast to ", k0.h(i10, "kotlin.jvm.functions.Function")));
            i.f(classCastException, s.class.getName());
            throw classCastException;
        }
    }
}
