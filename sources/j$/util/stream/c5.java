package j$.util.stream;

import java.util.function.Consumer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class c5 extends f5 {
    @Override // j$.util.stream.a
    public final boolean L() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a
    public final n5 M(int i, n5 n5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.f5, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (this.a.k) {
            super.forEach(consumer);
        } else {
            O().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (this.a.k) {
            super.forEachOrdered(consumer);
        } else {
            O().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !b7.ORDERED.n(this.f) ? this : new b5(this, b7.r);
    }
}
