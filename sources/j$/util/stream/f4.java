package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class f4 extends t3 {
    public final /* synthetic */ BinaryOperator h;
    public final /* synthetic */ BiConsumer i;
    public final /* synthetic */ Supplier j;
    public final /* synthetic */ Collector k;

    @Override // j$.util.stream.t3
    public final o4 D0() {
        return new g4(this.j, this.i, this.h);
    }

    @Override // j$.util.stream.t3, j$.util.stream.b8
    public final int v() {
        if (this.k.characteristics().contains(g.UNORDERED)) {
            return v6.r;
        }
        return 0;
    }

    public f4(w6 w6Var, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = collector;
    }
}
