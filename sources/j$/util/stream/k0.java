package j$.util.stream;

import j$.util.Optional;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class k0 extends l0 {
    public static final g0 c;
    public static final g0 d;

    static {
        c7 c7Var = c7.REFERENCE;
        c = new g0(true, c7Var, Optional.empty(), new q((byte) 16), new q((byte) 17));
        d = new g0(false, c7Var, Optional.empty(), new q((byte) 16), new q((byte) 17));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return Optional.of(this.b);
        }
        return null;
    }
}
