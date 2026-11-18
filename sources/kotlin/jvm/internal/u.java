package kotlin.jvm.internal;

import a8.p0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class u {
    public static void a(int i7, Object obj) {
        if (obj != null) {
            if (obj instanceof gd.a) {
                if ((obj instanceof g ? ((g) obj).getArity() : obj instanceof rd.a ? 0 : obj instanceof rd.l ? 1 : obj instanceof rd.p ? 2 : obj instanceof rd.q ? 3 : -1) == i7) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(p0.E(obj.getClass().getName(), " cannot be cast to ", i5.c.i(i7, "kotlin.jvm.functions.Function")));
            j.g(classCastException, u.class.getName());
            throw classCastException;
        }
    }
}
