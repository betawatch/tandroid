package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class g7 extends x6 implements j$.util.u0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.i(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.z(this, consumer);
    }

    @Override // j$.util.stream.x6
    public final x6 e(Spliterator spliterator) {
        return new g7(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.x6
    public final void d() {
        m6 m6Var = new m6();
        this.h = m6Var;
        Objects.requireNonNull(m6Var);
        this.e = this.b.G0(new f7(m6Var, 1));
        this.f = new j$.time.t(12, this);
    }

    @Override // j$.util.stream.x6, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.u0) super.trySplit();
    }

    @Override // j$.util.stream.x6, j$.util.Spliterator
    public final j$.util.d1 trySplit() {
        return (j$.util.u0) super.trySplit();
    }

    @Override // j$.util.stream.x6, j$.util.Spliterator
    public final j$.util.u0 trySplit() {
        return (j$.util.u0) super.trySplit();
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        double d;
        Objects.requireNonNull(doubleConsumer);
        boolean a2 = a();
        if (a2) {
            m6 m6Var = (m6) this.h;
            long j10 = this.g;
            int k9 = m6Var.k(j10);
            if (m6Var.c == 0 && k9 == 0) {
                d = ((double[]) m6Var.e)[(int) j10];
            } else {
                d = ((double[][]) m6Var.f)[k9][(int) (j10 - m6Var.d[k9])];
            }
            doubleConsumer.accept(d);
        }
        return a2;
    }

    @Override // j$.util.d1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.h == null && !this.i) {
            Objects.requireNonNull(doubleConsumer);
            c();
            Objects.requireNonNull(doubleConsumer);
            f7 f7Var = new f7(doubleConsumer, 0);
            this.b.F0(this.d, f7Var);
            this.i = true;
            return;
        }
        while (tryAdvance(doubleConsumer)) {
        }
    }
}
