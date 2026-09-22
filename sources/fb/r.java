package fb;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class r extends t {
    public final /* synthetic */ Method b;

    public r(Method method) {
        this.b = method;
    }

    @Override // fb.t
    public final Object a(Class cls) {
        String J = of.b.J(cls);
        if (J == null) {
            return this.b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(J));
    }
}
