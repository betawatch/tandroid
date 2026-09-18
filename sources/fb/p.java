package fb;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
        String D = of.b.D(cls);
        if (D == null) {
            return this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(D));
    }
}
