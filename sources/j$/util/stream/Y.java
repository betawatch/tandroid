package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class Y extends a0 {
    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !K() ? this : new u(this, a3.r, 2);
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ IntStream sequential() {
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

    @Override // j$.util.stream.a0, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        j$.util.Y Y;
        if (!isParallel()) {
            Y = a0.Y(S());
            Y.forEachRemaining(intConsumer);
        } else {
            super.forEach(intConsumer);
        }
    }

    @Override // j$.util.stream.a0, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        j$.util.Y Y;
        if (!isParallel()) {
            Y = a0.Y(S());
            Y.forEachRemaining(intConsumer);
        } else {
            super.forEachOrdered(intConsumer);
        }
    }
}
