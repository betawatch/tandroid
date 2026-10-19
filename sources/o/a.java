package o;

import java.util.HashMap;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
