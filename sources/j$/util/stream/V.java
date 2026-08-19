package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class V extends X {
    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final IntStream sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final IntStream parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.X, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        if (this.a.k) {
            super.forEach(intConsumer);
        } else {
            X.T(O()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.X, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        if (this.a.k) {
            super.forEachOrdered(intConsumer);
        } else {
            X.T(O()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !S2.ORDERED.q(this.f) ? this : new r(this, S2.r, 2);
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
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
