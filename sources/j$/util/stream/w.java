package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class w extends z {
    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final c0 sequential() {
        this.h.r = false;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final c0 parallel() {
        this.h.r = true;
        return this;
    }

    @Override // j$.util.stream.z, j$.util.stream.c0
    public final void forEach(DoubleConsumer doubleConsumer) {
        if (this.h.r) {
            super.forEach(doubleConsumer);
        } else {
            z.U0(S0()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.z, j$.util.stream.c0
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (this.h.r) {
            super.forEachOrdered(doubleConsumer);
        } else {
            z.U0(S0()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !v6.ORDERED.m(this.m) ? this : new r(this, v6.r, 1);
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
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
