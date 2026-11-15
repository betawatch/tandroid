package o;

import java.util.HashMap;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
