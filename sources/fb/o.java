package fb;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
        String D = of.b.D(cls);
        if (D == null) {
            return this.b.invoke(this.c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(D));
    }
}
