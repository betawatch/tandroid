package gb;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class o extends s {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public o(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // gb.s
    public final Object a(Class cls) {
        String y3 = qf.b.y(cls);
        if (y3 == null) {
            return this.b.invoke(this.c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(y3));
    }
}
