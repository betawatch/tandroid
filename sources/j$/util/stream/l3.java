package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class l3 extends c3 implements j$.util.V {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.S.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.S.f(this, consumer);
    }

    @Override // j$.util.stream.c3
    final c3 e(Spliterator spliterator) {
        return new l3(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.c3
    final void d() {
        P2 p2 = new P2();
        this.h = p2;
        Objects.requireNonNull(p2);
        this.e = this.b.V(new k3(p2, 0));
        this.f = new a(3, this);
    }

    @Override // j$.util.stream.c3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.V) super.trySplit();
    }

    @Override // j$.util.stream.c3, j$.util.Spliterator
    public final j$.util.V trySplit() {
        return (j$.util.V) super.trySplit();
    }

    @Override // j$.util.stream.c3, j$.util.Spliterator
    public final j$.util.e0 trySplit() {
        return (j$.util.V) super.trySplit();
    }

    @Override // j$.util.e0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        double d;
        Objects.requireNonNull(doubleConsumer);
        boolean a = a();
        if (a) {
            P2 p2 = (P2) this.h;
            long j = this.g;
            int u = p2.u(j);
            if (p2.c == 0 && u == 0) {
                d = ((double[]) p2.e)[(int) j];
            } else {
                d = ((double[][]) p2.f)[u][(int) (j - p2.d[u])];
            }
            doubleConsumer.accept(d);
        }
        return a;
    }

    @Override // j$.util.e0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.h == null && !this.i) {
            Objects.requireNonNull(doubleConsumer);
            c();
            Objects.requireNonNull(doubleConsumer);
            k3 k3Var = new k3(doubleConsumer, 1);
            this.b.U(this.d, k3Var);
            this.i = true;
            return;
        }
        while (tryAdvance(doubleConsumer)) {
        }
    }
}
