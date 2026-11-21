package o;

import java.util.HashMap;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class a extends f {
    public final HashMap e = new HashMap();

    @Override // o.f
    public final c f(Object obj) {
        return (c) this.e.get(obj);
    }

    @Override // o.f
    public final Object i(Object obj) {
        Object i7 = super.i(obj);
        this.e.remove(obj);
        return i7;
    }
}
