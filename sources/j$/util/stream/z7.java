package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class z7 extends a8 implements j$.util.a1, LongConsumer {
    public long e;

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.e = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.time.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.a8
    public final void d(Object obj) {
        ((LongConsumer) obj).accept(this.e);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.time.a.j(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.time.a.A(this, consumer);
    }

    @Override // j$.util.stream.a8, j$.util.stream.d8, j$.util.d1, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.a1 trySplit() {
        return (j$.util.a1) trySplit();
    }
}
