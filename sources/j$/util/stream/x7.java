package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class x7 extends a8 implements j$.util.u0, DoubleConsumer {
    public double e;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.e = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.time.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.d8
    public final Spliterator b(Spliterator spliterator) {
        return new x7((j$.util.u0) spliterator, this);
    }

    @Override // j$.util.stream.a8
    public final void d(Object obj) {
        ((DoubleConsumer) obj).accept(this.e);
    }

    @Override // j$.util.stream.a8
    public final h7 e() {
        return new e7();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.time.a.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.time.a.y(this, consumer);
    }

    @Override // j$.util.stream.a8, j$.util.stream.d8, j$.util.d1, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.u0 trySplit() {
        return (j$.util.u0) trySplit();
    }
}
