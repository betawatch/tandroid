package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class d0 extends f0 {
    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final LongStream sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final LongStream parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.f0, j$.util.stream.LongStream
    public final void forEach(LongConsumer longConsumer) {
        if (this.a.k) {
            super.forEach(longConsumer);
        } else {
            f0.T(O()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.f0, j$.util.stream.LongStream
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (this.a.k) {
            super.forEachOrdered(longConsumer);
        } else {
            f0.T(O()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !S2.ORDERED.q(this.f) ? this : new s(this, S2.r, 4);
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
