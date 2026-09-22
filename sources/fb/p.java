package fb;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class p extends t {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public p(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // fb.t
    public final Object a(Class cls) {
        String J = of.b.J(cls);
        if (J == null) {
            return this.b.invoke(this.c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(J));
    }
}
