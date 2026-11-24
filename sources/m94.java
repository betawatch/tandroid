// default package

import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class m94 extends xq9 {
    public final HashMap e = new HashMap();

    @Override // xq9
    public final uq9 h(Object obj) {
        return (uq9) this.e.get(obj);
    }

    @Override // xq9
    public final Object i(Object obj) {
        Object i = super.i(obj);
        this.e.remove(obj);
        return i;
    }
}
