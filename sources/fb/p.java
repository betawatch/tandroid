package fb;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
        String x10 = pf.b.x(cls);
        if (x10 == null) {
            return this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(x10));
    }
}
