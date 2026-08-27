package j$.util.stream;

import j$.util.Optional;

/* loaded from: classes2.dex */
public final class h0 extends i0 {
    public static final d0 c;
    public static final d0 d;

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return Optional.of(this.b);
        }
        return null;
    }

    static {
        w6 w6Var = w6.REFERENCE;
        c = new d0(true, w6Var, Optional.empty(), new n(16), new n(17));
        d = new d0(false, w6Var, Optional.empty(), new n(16), new n(17));
    }
}
