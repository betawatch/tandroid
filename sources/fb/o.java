package fb;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final class o extends s {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public o(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // fb.s
    public final Object a(Class cls) {
        String t10 = of.b.t(cls);
        if (t10 == null) {
            return this.b.invoke(this.c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(t10));
    }
}
