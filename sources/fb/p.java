package fb;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class p extends s {
    public final /* synthetic */ Method b;
    public final /* synthetic */ int c;

    public p(int i10, Method method) {
        this.b = method;
        this.c = i10;
    }

    @Override // fb.s
    public final Object a(Class cls) {
        String u10 = of.b.u(cls);
        if (u10 == null) {
            return this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(u10));
    }
}
