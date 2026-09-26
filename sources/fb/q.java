package fb;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class q extends s {
    public final /* synthetic */ Method b;

    public q(Method method) {
        this.b = method;
    }

    @Override // fb.s
    public final Object a(Class cls) {
        String D = of.b.D(cls);
        if (D == null) {
            return this.b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(D));
    }
}
