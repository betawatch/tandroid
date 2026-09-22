package fb;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        String E = of.b.E(cls);
        if (E == null) {
            return this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(E));
    }
}
