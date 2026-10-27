package hb;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class p extends s {
    public final /* synthetic */ Method b;
    public final /* synthetic */ int c;

    public p(int i10, Method method) {
        this.b = method;
        this.c = i10;
    }

    @Override // hb.s
    public final Object a(Class cls) {
        String F = rf.b.F(cls);
        if (F == null) {
            return this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(F));
    }
}
