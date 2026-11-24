package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class o7 extends d7 implements j$.util.x0 {
    @Override // j$.util.stream.d7
    public final void d() {
        t6 t6Var = new t6();
        this.h = t6Var;
        Objects.requireNonNull(t6Var);
        this.e = this.b.R(new n7(t6Var, (byte) 1));
        this.f = new j$.time.v((byte) 10, this);
    }

    @Override // j$.util.stream.d7
    public final d7 e(Spliterator spliterator) {
        return new o7(this.b, spliterator, this.a);
    }

    @Override // j$.util.d1
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(intConsumer)) {
            }
            return;
        }
        Objects.requireNonNull(intConsumer);
        c();
        Objects.requireNonNull(intConsumer);
        n7 n7Var = new n7(intConsumer, (byte) 0);
        this.b.Q(this.d, n7Var);
        this.i = true;
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        boolean a = a();
        if (a) {
            t6 t6Var = (t6) this.h;
            long j = this.g;
            int k = t6Var.k(j);
            intConsumer.accept((t6Var.c == 0 && k == 0) ? ((int[]) t6Var.e)[(int) j] : ((int[][]) t6Var.f)[k][(int) (j - t6Var.d[k])]);
        }
        return a;
    }

    @Override // j$.util.stream.d7, j$.util.Spliterator
    public final j$.util.x0 trySplit() {
        return (j$.util.x0) super.trySplit();
    }

    @Override // j$.util.stream.d7, j$.util.Spliterator
    public final j$.util.d1 trySplit() {
        return (j$.util.x0) super.trySplit();
    }

    @Override // j$.util.stream.d7, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.x0) super.trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.time.a.i(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.time.a.z(this, consumer);
    }
}
