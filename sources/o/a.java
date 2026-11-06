package o;

import java.util.HashMap;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
