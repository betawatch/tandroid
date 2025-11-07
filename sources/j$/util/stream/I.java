package j$.util.stream;

import j$.util.Optional;

/* loaded from: classes2.dex */
final class I extends J {
    static final E c;
    static final E d;

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return Optional.of(this.b);
        }
        return null;
    }

    static {
        b3 b3Var = b3.REFERENCE;
        c = new E(true, b3Var, Optional.empty(), new k(16), new j(11));
        d = new E(false, b3Var, Optional.empty(), new k(16), new j(11));
    }
}
