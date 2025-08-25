package j$.util.stream;

import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class Q2 extends U2 implements j$.util.Y {
    final /* synthetic */ R2 g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.S.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.S.g(this, consumer);
    }

    @Override // j$.util.stream.U2
    final void a(int i, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i]);
    }

    @Override // j$.util.stream.U2
    final j$.util.e0 b(Object obj, int i, int i2) {
        return Spliterators.k((int[]) obj, i, i2 + i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q2(R2 r2, int i, int i2, int i3, int i4) {
        super(r2, i, i2, i3, i4);
        this.g = r2;
    }

    @Override // j$.util.stream.U2
    final j$.util.e0 c(int i, int i2, int i3, int i4) {
        return new Q2(this.g, i, i2, i3, i4);
    }
}
