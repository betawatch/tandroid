package o;

import java.util.HashMap;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
