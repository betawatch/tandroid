package o;

import java.util.HashMap;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
