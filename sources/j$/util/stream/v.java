package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class v extends x {
    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final A sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final A parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.x, j$.util.stream.A
    public final void forEach(DoubleConsumer doubleConsumer) {
        if (this.a.k) {
            super.forEach(doubleConsumer);
        } else {
            x.T(O()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.x, j$.util.stream.A
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (this.a.k) {
            super.forEachOrdered(doubleConsumer);
        } else {
            x.T(O()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !S2.ORDERED.q(this.f) ? this : new q(this, S2.r, 1);
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
