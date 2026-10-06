package o;

import java.util.HashMap;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
