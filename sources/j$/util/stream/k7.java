package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class k7 extends x6 implements j$.util.a1 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.B(this, consumer);
    }

    @Override // j$.util.stream.x6
    public final x6 e(Spliterator spliterator) {
        return new k7(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.x6
    public final void d() {
        q6 q6Var = new q6();
        this.h = q6Var;
        Objects.requireNonNull(q6Var);
        this.e = this.b.G0(new j7(q6Var, 1));
        this.f = new j$.time.t(14, this);
    }

    @Override // j$.util.stream.x6, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.a1) super.trySplit();
    }

    @Override // j$.util.stream.x6, j$.util.Spliterator
    public final j$.util.a1 trySplit() {
        return (j$.util.a1) super.trySplit();
    }

    @Override // j$.util.stream.x6, j$.util.Spliterator
    public final j$.util.d1 trySplit() {
        return (j$.util.a1) super.trySplit();
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j10;
        Objects.requireNonNull(longConsumer);
        boolean a2 = a();
        if (a2) {
            q6 q6Var = (q6) this.h;
            long j11 = this.g;
            int k9 = q6Var.k(j11);
            if (q6Var.c == 0 && k9 == 0) {
                j10 = ((long[]) q6Var.e)[(int) j11];
            } else {
                j10 = ((long[][]) q6Var.f)[k9][(int) (j11 - q6Var.d[k9])];
            }
            longConsumer.accept(j10);
        }
        return a2;
    }

    @Override // j$.util.d1
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.h == null && !this.i) {
            Objects.requireNonNull(longConsumer);
            c();
            Objects.requireNonNull(longConsumer);
            j7 j7Var = new j7(longConsumer, 0);
            this.b.F0(this.d, j7Var);
            this.i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }
}
