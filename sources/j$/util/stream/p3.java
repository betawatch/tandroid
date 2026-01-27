package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class p3 extends c3 implements j$.util.c0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.T.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.T.h(this, consumer);
    }

    @Override // j$.util.stream.c3
    final c3 e(Spliterator spliterator) {
        return new p3(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.c3
    final void d() {
        T2 t2 = new T2();
        this.h = t2;
        Objects.requireNonNull(t2);
        this.e = this.b.V(new o3(t2, 0));
        this.f = new a(5, this);
    }

    @Override // j$.util.stream.c3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.c0) super.trySplit();
    }

    @Override // j$.util.stream.c3, j$.util.Spliterator
    public final j$.util.c0 trySplit() {
        return (j$.util.c0) super.trySplit();
    }

    @Override // j$.util.stream.c3, j$.util.Spliterator
    public final j$.util.f0 trySplit() {
        return (j$.util.c0) super.trySplit();
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j;
        Objects.requireNonNull(longConsumer);
        boolean a = a();
        if (a) {
            T2 t2 = (T2) this.h;
            long j2 = this.g;
            int u = t2.u(j2);
            if (t2.c == 0 && u == 0) {
                j = ((long[]) t2.e)[(int) j2];
            } else {
                j = ((long[][]) t2.f)[u][(int) (j2 - t2.d[u])];
            }
            longConsumer.accept(j);
        }
        return a;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.h == null && !this.i) {
            Objects.requireNonNull(longConsumer);
            c();
            Objects.requireNonNull(longConsumer);
            o3 o3Var = new o3(longConsumer, 1);
            this.b.U(this.d, o3Var);
            this.i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }
}
