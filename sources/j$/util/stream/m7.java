package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class m7 extends d7 implements j$.util.u0 {
    @Override // j$.util.d1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(doubleConsumer)) {
            }
            return;
        }
        Objects.requireNonNull(doubleConsumer);
        c();
        Objects.requireNonNull(doubleConsumer);
        l7 l7Var = new l7(doubleConsumer, (byte) 0);
        this.b.Q(this.d, l7Var);
        this.i = true;
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        boolean a = a();
        if (a) {
            r6 r6Var = (r6) this.h;
            long j = this.g;
            int k = r6Var.k(j);
            doubleConsumer.accept((r6Var.c == 0 && k == 0) ? ((double[]) r6Var.e)[(int) j] : ((double[][]) r6Var.f)[k][(int) (j - r6Var.d[k])]);
        }
        return a;
    }

    @Override // j$.util.stream.d7, j$.util.Spliterator
    public final j$.util.u0 trySplit() {
        return (j$.util.u0) super.trySplit();
    }

    @Override // j$.util.stream.d7, j$.util.Spliterator
    public final j$.util.d1 trySplit() {
        return (j$.util.u0) super.trySplit();
    }

    @Override // j$.util.stream.d7, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.u0) super.trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.time.a.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.time.a.y(this, consumer);
    }
}
