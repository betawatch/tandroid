package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class d3 extends U2 implements j$.util.T {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.i(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.z(this, consumer);
    }

    @Override // j$.util.stream.U2
    public final U2 e(Spliterator spliterator) {
        return new d3(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.U2
    public final void d() {
        I2 i2 = new I2();
        this.h = i2;
        Objects.requireNonNull(i2);
        this.e = this.b.R(new c3(i2, 1));
        this.f = new j$.time.t(12, this);
    }

    @Override // j$.util.stream.U2, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.T) super.trySplit();
    }

    @Override // j$.util.stream.U2, j$.util.Spliterator
    public final j$.util.T trySplit() {
        return (j$.util.T) super.trySplit();
    }

    @Override // j$.util.stream.U2, j$.util.Spliterator
    public final j$.util.c0 trySplit() {
        return (j$.util.T) super.trySplit();
    }

    @Override // j$.util.c0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        double d;
        Objects.requireNonNull(doubleConsumer);
        boolean a = a();
        if (a) {
            I2 i2 = (I2) this.h;
            long j = this.g;
            int o = i2.o(j);
            if (i2.c == 0 && o == 0) {
                d = ((double[]) i2.e)[(int) j];
            } else {
                d = ((double[][]) i2.f)[o][(int) (j - i2.d[o])];
            }
            doubleConsumer.accept(d);
        }
        return a;
    }

    @Override // j$.util.c0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.h == null && !this.i) {
            Objects.requireNonNull(doubleConsumer);
            c();
            Objects.requireNonNull(doubleConsumer);
            c3 c3Var = new c3(doubleConsumer, 0);
            this.b.Q(this.d, c3Var);
            this.i = true;
            return;
        }
        while (tryAdvance(doubleConsumer)) {
        }
    }
}
