package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class c2 extends e2 {
    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !K() ? this : new b2(this, a3.r, 1);
    }

    @Override // j$.util.stream.b
    final boolean P() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.b
    final m2 Q(int i, m2 m2Var) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.e2, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (!isParallel()) {
            S().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // j$.util.stream.e2, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (!isParallel()) {
            S().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }
}
