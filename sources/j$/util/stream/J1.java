package j$.util.stream;

import j$.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class J1 extends w0 {
    final /* synthetic */ BinaryOperator h;
    final /* synthetic */ BiConsumer i;
    final /* synthetic */ Supplier j;
    final /* synthetic */ Collector k;

    @Override // j$.util.stream.w0
    public final S1 e0() {
        return new K1(this.j, this.i, this.h);
    }

    @Override // j$.util.stream.w0, j$.util.stream.G3
    public final int d() {
        if (this.k.characteristics().contains(Collector.Characteristics.UNORDERED)) {
            return a3.r;
        }
        return 0;
    }

    J1(b3 b3Var, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = collector;
    }
}
