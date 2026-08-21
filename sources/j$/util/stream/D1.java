package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class D1 extends r1 {
    public final /* synthetic */ BinaryOperator h;
    public final /* synthetic */ BiConsumer i;
    public final /* synthetic */ Supplier j;
    public final /* synthetic */ Collector k;

    @Override // j$.util.stream.r1
    public final M1 Z() {
        return new E1(this.j, this.i, this.h);
    }

    @Override // j$.util.stream.r1, j$.util.stream.y3
    public final int d() {
        if (this.k.characteristics().contains(g.UNORDERED)) {
            return S2.r;
        }
        return 0;
    }

    public D1(T2 t2, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = collector;
    }
}
