package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class U1 extends W1 {
    U1(Spliterator spliterator, int i, boolean z) {
        super(spliterator, i, z);
    }

    @Override // j$.util.stream.W1, j$.util.stream.Stream
    public final void e(Consumer consumer) {
        if (isParallel()) {
            super.e(consumer);
        } else {
            z0().a(consumer);
        }
    }

    @Override // j$.util.stream.W1, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (isParallel()) {
            super.forEach(consumer);
        } else {
            z0().a(consumer);
        }
    }

    @Override // j$.util.stream.b
    final boolean w0() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.b
    final e2 x0(int i, e2 e2Var) {
        throw new UnsupportedOperationException();
    }
}
