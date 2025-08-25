package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class y extends A {
    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !K() ? this : new t(this, a3.r, 1);
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ D parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ D sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream, j$.util.stream.D
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.b
    final boolean P() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.b
    final m2 Q(int i, m2 m2Var) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.A, j$.util.stream.D
    public final void forEach(DoubleConsumer doubleConsumer) {
        j$.util.V Y;
        if (!isParallel()) {
            Y = A.Y(S());
            Y.forEachRemaining(doubleConsumer);
        } else {
            super.forEach(doubleConsumer);
        }
    }

    @Override // j$.util.stream.A, j$.util.stream.D
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        j$.util.V Y;
        if (!isParallel()) {
            Y = A.Y(S());
            Y.forEachRemaining(doubleConsumer);
        } else {
            super.forEachOrdered(doubleConsumer);
        }
    }
}
