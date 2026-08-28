package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class y4 extends b5 {
    @Override // j$.util.stream.b5, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (!this.h.r) {
            S0().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // j$.util.stream.b5, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (!this.h.r) {
            S0().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !v6.ORDERED.m(this.m) ? this : new x4(this, v6.r);
    }

    @Override // j$.util.stream.a
    public final boolean P0() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a
    public final j5 Q0(int i9, j5 j5Var) {
        throw new UnsupportedOperationException();
    }
}
