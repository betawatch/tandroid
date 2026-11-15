package o;

import java.util.HashMap;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
