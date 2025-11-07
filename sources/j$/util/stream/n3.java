package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class n3 extends c3 implements j$.util.Y {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.S.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.S.g(this, consumer);
    }

    @Override // j$.util.stream.c3
    final c3 e(Spliterator spliterator) {
        return new n3(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.c3
    final void d() {
        R2 r2 = new R2();
        this.h = r2;
        Objects.requireNonNull(r2);
        this.e = this.b.V(new m3(r2, 0));
        this.f = new a(4, this);
    }

    @Override // j$.util.stream.c3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.Y) super.trySplit();
    }

    @Override // j$.util.stream.c3, j$.util.Spliterator
    public final j$.util.Y trySplit() {
        return (j$.util.Y) super.trySplit();
    }

    @Override // j$.util.stream.c3, j$.util.Spliterator
    public final j$.util.e0 trySplit() {
        return (j$.util.Y) super.trySplit();
    }

    @Override // j$.util.e0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i;
        Objects.requireNonNull(intConsumer);
        boolean a = a();
        if (a) {
            R2 r2 = (R2) this.h;
            long j = this.g;
            int u = r2.u(j);
            if (r2.c == 0 && u == 0) {
                i = ((int[]) r2.e)[(int) j];
            } else {
                i = ((int[][]) r2.f)[u][(int) (j - r2.d[u])];
            }
            intConsumer.accept(i);
        }
        return a;
    }

    @Override // j$.util.e0
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.h == null && !this.i) {
            Objects.requireNonNull(intConsumer);
            c();
            Objects.requireNonNull(intConsumer);
            m3 m3Var = new m3(intConsumer, 1);
            this.b.U(this.d, m3Var);
            this.i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }
}
