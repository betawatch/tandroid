package o;

import java.util.HashMap;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class a extends f {
    public final HashMap e = new HashMap();

    @Override // o.f
    public final c i(Object obj) {
        return (c) this.e.get(obj);
    }

    @Override // o.f
    public final Object n(Object obj) {
        Object n10 = super.n(obj);
        this.e.remove(obj);
        return n10;
    }
}
