package j$.util.stream;

import j$.util.Optional;

/* loaded from: classes2.dex */
final class I extends J {
    @Override // j$.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return Optional.of(this.b);
        }
        return null;
    }
}
