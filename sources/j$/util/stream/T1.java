package j$.util.stream;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class T1 extends V1 {
    @Override // j$.util.stream.b
    final boolean v0() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.b
    final d2 w0(int i, d2 d2Var) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.V1, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (!isParallel()) {
            y0().a(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // j$.util.stream.V1, j$.util.stream.Stream
    public final void e(Consumer consumer) {
        if (!isParallel()) {
            y0().a(consumer);
        } else {
            super.e(consumer);
        }
    }
}
