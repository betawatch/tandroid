package gb;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class q extends t {
    public final /* synthetic */ Method b;
    public final /* synthetic */ int c;

    public q(int i10, Method method) {
        this.b = method;
        this.c = i10;
    }

    @Override // gb.t
    public final Object a(Class cls) {
        String x10 = qf.b.x(cls);
        if (x10 == null) {
            return this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(x10));
    }
}
