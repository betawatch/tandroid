package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class h3 extends U2 implements j$.util.Z {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.B(this, consumer);
    }

    @Override // j$.util.stream.U2
    public final U2 e(Spliterator spliterator) {
        return new h3(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.U2
    public final void d() {
        N2 n2 = new N2();
        this.h = n2;
        Objects.requireNonNull(n2);
        this.e = this.b.R(new g3(n2, 1));
        this.f = new j$.time.t(14, this);
    }

    @Override // j$.util.stream.U2, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.Z) super.trySplit();
    }

    @Override // j$.util.stream.U2, j$.util.Spliterator
    public final j$.util.Z trySplit() {
        return (j$.util.Z) super.trySplit();
    }

    @Override // j$.util.stream.U2, j$.util.Spliterator
    public final j$.util.c0 trySplit() {
        return (j$.util.Z) super.trySplit();
    }

    @Override // j$.util.c0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j;
        Objects.requireNonNull(longConsumer);
        boolean a = a();
        if (a) {
            N2 n2 = (N2) this.h;
            long j2 = this.g;
            int o = n2.o(j2);
            if (n2.c == 0 && o == 0) {
                j = ((long[]) n2.e)[(int) j2];
            } else {
                j = ((long[][]) n2.f)[o][(int) (j2 - n2.d[o])];
            }
            longConsumer.accept(j);
        }
        return a;
    }

    @Override // j$.util.c0
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.h == null && !this.i) {
            Objects.requireNonNull(longConsumer);
            c();
            Objects.requireNonNull(longConsumer);
            g3 g3Var = new g3(longConsumer, 0);
            this.b.Q(this.d, g3Var);
            this.i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }
}
