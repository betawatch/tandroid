package j$.util.stream;

import j$.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class C1 extends q1 {
    public final /* synthetic */ BinaryOperator h;
    public final /* synthetic */ BiConsumer i;
    public final /* synthetic */ Supplier j;
    public final /* synthetic */ Collector k;

    @Override // j$.util.stream.q1
    public final L1 Y() {
        return new D1(this.j, this.i, this.h);
    }

    @Override // j$.util.stream.q1, j$.util.stream.y3
    public final int d() {
        if (this.k.characteristics().contains(Collector.Characteristics.UNORDERED)) {
            return S2.r;
        }
        return 0;
    }

    public C1(T2 t2, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = collector;
    }
}
