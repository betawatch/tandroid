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
        J2 j2 = new J2();
        this.h = j2;
        Objects.requireNonNull(j2);
        this.e = this.b.R(new c3(j2, 1));
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
            J2 j2 = (J2) this.h;
            long j = this.g;
            int o = j2.o(j);
            if (j2.c == 0 && o == 0) {
                d = ((double[]) j2.e)[(int) j];
            } else {
                d = ((double[][]) j2.f)[o][(int) (j - j2.d[o])];
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
