package gb;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class q extends u {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public q(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // gb.u
    public final Object a(Class cls) {
        String w9 = qf.b.w(cls);
        if (w9 == null) {
            return this.b.invoke(this.c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(w9));
    }
}
