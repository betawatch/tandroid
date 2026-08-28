package na;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o extends s {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public o(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // na.s
    public final Object a(Class cls) {
        String i9 = g5.b.i(cls);
        if (i9 == null) {
            return this.b.invoke(this.c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(i9));
    }
}
