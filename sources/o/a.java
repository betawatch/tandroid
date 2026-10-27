package o;

import java.util.HashMap;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
