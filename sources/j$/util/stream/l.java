package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BinaryOperator;
import j$.util.function.Function;
import j$.util.function.Supplier;
import java.util.Set;

/* loaded from: classes2.dex */
final class l implements Collector {
    private final Supplier a;
    private final BiConsumer b;
    private final BinaryOperator c;
    private final Function d;
    private final Set e;

    l(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, Set set) {
        this.a = supplier;
        this.b = biConsumer;
        this.c = binaryOperator;
        this.d = function;
        this.e = set;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    l(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Set set) {
        this(supplier, biConsumer, binaryOperator, new k(0), set);
        Set set2 = Collectors.a;
    }

    @Override // j$.util.stream.Collector
    public final BiConsumer accumulator() {
        return this.b;
    }

    @Override // j$.util.stream.Collector
    public final Supplier supplier() {
        return this.a;
    }

    @Override // j$.util.stream.Collector
    public final BinaryOperator combiner() {
        return this.c;
    }

    @Override // j$.util.stream.Collector
    public final Function finisher() {
        return this.d;
    }

    @Override // j$.util.stream.Collector
    public final Set characteristics() {
        return this.e;
    }
}
