package o;

import java.util.HashMap;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
