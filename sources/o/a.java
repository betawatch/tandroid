package o;

import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a extends f {
    public final HashMap e = new HashMap();

    @Override // o.f
    public final c l(Object obj) {
        return (c) this.e.get(obj);
    }

    @Override // o.f
    public final Object m(Object obj) {
        Object m10 = super.m(obj);
        this.e.remove(obj);
        return m10;
    }
}
