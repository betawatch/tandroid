package j$.util.stream;

import j$.util.Optional;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
