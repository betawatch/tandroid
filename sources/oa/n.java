package oa;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n extends r {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public n(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // oa.r
    public final Object a(Class cls) {
        String j10 = g5.b.j(cls);
        if (j10 == null) {
            return this.b.invoke(this.c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(j10));
    }
}
