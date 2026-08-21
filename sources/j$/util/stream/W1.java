package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class W1 extends Y1 {
    @Override // j$.util.stream.Y1, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (!this.a.k) {
            O().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // j$.util.stream.Y1, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (!this.a.k) {
            O().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !S2.ORDERED.q(this.f) ? this : new V1(this, S2.r, 1);
    }

    @Override // j$.util.stream.a
    public final boolean L() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a
    public final g2 M(int i, g2 g2Var) {
        throw new UnsupportedOperationException();
    }
}
