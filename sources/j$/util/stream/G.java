package j$.util.stream;

import j$.util.Optional;

/* loaded from: classes2.dex */
public final class G extends H {
    public static final C c;
    public static final C d;

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return Optional.of(this.b);
        }
        return null;
    }

    static {
        T2 t2 = T2.REFERENCE;
        c = new C(true, t2, Optional.empty(), new n(16), new n(17));
        d = new C(false, t2, Optional.empty(), new n(16), new n(17));
    }
}
