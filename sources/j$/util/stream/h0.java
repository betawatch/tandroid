package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class h0 extends j0 {
    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !K() ? this : new v(this, a3.r, 4);
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ LongStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ LongStream sequential() {
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

    @Override // j$.util.stream.j0, j$.util.stream.LongStream
    public final void forEach(LongConsumer longConsumer) {
        j$.util.b0 Y;
        if (!isParallel()) {
            Y = j0.Y(S());
            Y.forEachRemaining(longConsumer);
        } else {
            super.forEach(longConsumer);
        }
    }

    @Override // j$.util.stream.j0, j$.util.stream.LongStream
    public final void forEachOrdered(LongConsumer longConsumer) {
        j$.util.b0 Y;
        if (!isParallel()) {
            Y = j0.Y(S());
            Y.forEachRemaining(longConsumer);
        } else {
            super.forEachOrdered(longConsumer);
        }
    }
}
