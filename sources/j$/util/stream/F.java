package j$.util.stream;

import j$.util.Optional;

/* loaded from: classes2.dex */
public final class F extends G {
    public static final B c;
    public static final B d;

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return Optional.of(this.b);
        }
        return null;
    }

    static {
        T2 t2 = T2.REFERENCE;
        c = new B(true, t2, Optional.empty(), new m(16), new m(17));
        d = new B(false, t2, Optional.empty(), new m(16), new m(17));
    }
}
