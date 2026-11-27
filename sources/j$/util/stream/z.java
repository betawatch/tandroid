package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class z extends c0 {
    @Override // j$.util.stream.c0, j$.util.stream.f0
    public final void forEach(DoubleConsumer doubleConsumer) {
        if (this.a.k) {
            super.forEach(doubleConsumer);
        } else {
            c0.T(O()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.c0, j$.util.stream.f0
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (this.a.k) {
            super.forEachOrdered(doubleConsumer);
        } else {
            c0.T(O()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final f0 parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final f0 sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !b7.ORDERED.n(this.f) ? this : new u(this, b7.r, (byte) 1);
    }
}
