package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class V1 extends X1 {
    @Override // j$.util.stream.X1, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (!this.a.k) {
            O().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // j$.util.stream.X1, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (!this.a.k) {
            O().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !S2.ORDERED.q(this.f) ? this : new U1(this, S2.r, 1);
    }

    @Override // j$.util.stream.a
    public final boolean L() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a
    public final f2 M(int i, f2 f2Var) {
        throw new UnsupportedOperationException();
    }
}
