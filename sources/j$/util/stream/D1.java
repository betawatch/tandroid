package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BinaryOperator;
import j$.util.function.Supplier;
import j$.util.stream.Collector;

/* loaded from: classes2.dex */
final class D1 extends t0 {
    final /* synthetic */ BinaryOperator h;
    final /* synthetic */ BiConsumer i;
    final /* synthetic */ Supplier j;
    final /* synthetic */ Collector k;

    @Override // j$.util.stream.t0
    public final N1 d0() {
        return new E1(this.j, this.i, this.h);
    }

    @Override // j$.util.stream.t0, j$.util.stream.v3
    public final int d() {
        if (this.k.characteristics().contains(Collector.Characteristics.UNORDERED)) {
            return Q2.r;
        }
        return 0;
    }

    D1(R2 r2, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = collector;
    }
}
