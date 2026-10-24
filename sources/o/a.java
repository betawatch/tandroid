package o;

import java.util.HashMap;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class a extends f {
    public final HashMap e = new HashMap();

    @Override // o.f
    public final c h(Object obj) {
        return (c) this.e.get(obj);
    }

    @Override // o.f
    public final Object m(Object obj) {
        Object m10 = super.m(obj);
        this.e.remove(obj);
        return m10;
    }
}
