package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public final class q7 extends d7 implements j$.util.a1 {
    @Override // j$.util.stream.d7
    public final void d() {
        v6 v6Var = new v6();
        this.h = v6Var;
        Objects.requireNonNull(v6Var);
        this.e = this.b.R(new p7(v6Var, (byte) 1));
        this.f = new j$.time.v((byte) 11, this);
    }

    @Override // j$.util.stream.d7
    public final d7 e(Spliterator spliterator) {
        return new q7(this.b, spliterator, this.a);
    }

    @Override // j$.util.d1
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(longConsumer)) {
            }
            return;
        }
        Objects.requireNonNull(longConsumer);
        c();
        Objects.requireNonNull(longConsumer);
        p7 p7Var = new p7(longConsumer, (byte) 0);
        this.b.Q(this.d, p7Var);
        this.i = true;
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        boolean a = a();
        if (a) {
            v6 v6Var = (v6) this.h;
            long j = this.g;
            int k = v6Var.k(j);
            longConsumer.accept((v6Var.c == 0 && k == 0) ? ((long[]) v6Var.e)[(int) j] : ((long[][]) v6Var.f)[k][(int) (j - v6Var.d[k])]);
        }
        return a;
    }

    @Override // j$.util.stream.d7, j$.util.Spliterator
    public final j$.util.a1 trySplit() {
        return (j$.util.a1) super.trySplit();
    }

    @Override // j$.util.stream.d7, j$.util.Spliterator
    public final j$.util.d1 trySplit() {
        return (j$.util.a1) super.trySplit();
    }

    @Override // j$.util.stream.d7, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.a1) super.trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.time.a.j(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.time.a.A(this, consumer);
    }
}
