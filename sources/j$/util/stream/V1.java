package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.BinaryOperator;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import j$.util.function.Supplier;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import j$.util.stream.Collector;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes2.dex */
abstract class V1 extends b implements Stream {
    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new y2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new o(this, Q2.m | Q2.t, 0);
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) i0(new E(false, R2.REFERENCE, Optional.empty(), new q(4), new k(5)));
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) i0(new E(true, R2.REFERENCE, Optional.empty(), new q(4), new k(5)));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new y2(this, comparator);
    }

    @Override // j$.util.stream.b
    final R2 n0() {
        return R2.REFERENCE;
    }

    @Override // j$.util.stream.b
    final F0 k0(b bVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return t0.E(bVar, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.b
    final Spliterator z0(b bVar, Supplier supplier, boolean z) {
        return new t3(bVar, supplier, z);
    }

    @Override // j$.util.stream.b
    final void m0(Spliterator spliterator, d2 d2Var) {
        while (!d2Var.q() && spliterator.s(d2Var)) {
        }
    }

    @Override // j$.util.stream.b
    final x0 s0(long j, IntFunction intFunction) {
        return t0.D(j, intFunction);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    public final Iterator iterator() {
        return Spliterators.i(spliterator());
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !q0() ? this : new R1(this, Q2.r, 1);
    }

    @Override // j$.util.stream.Stream
    public final Stream M(Consumer consumer) {
        consumer.getClass();
        return new u(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final LongStream P(Function function) {
        function.getClass();
        return new w(this, Q2.p | Q2.n | Q2.t, function, 6);
    }

    @Override // j$.util.stream.Stream
    public final D Z(ToDoubleFunction toDoubleFunction) {
        toDoubleFunction.getClass();
        return new t(this, Q2.p | Q2.n, toDoubleFunction, 6);
    }

    @Override // j$.util.stream.Stream
    public final IntStream b(Function function) {
        function.getClass();
        return new v(this, Q2.p | Q2.n | Q2.t, function, 7);
    }

    public void e(Consumer consumer) {
        consumer.getClass();
        i0(new O(consumer, true));
    }

    @Override // j$.util.stream.Stream
    public final Object e0(Object obj, BinaryOperator binaryOperator) {
        binaryOperator.getClass();
        return i0(new u1(R2.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        predicate.getClass();
        return new u(this, Q2.t, predicate, 4);
    }

    public void forEach(Consumer consumer) {
        consumer.getClass();
        i0(new O(consumer, false));
    }

    @Override // j$.util.stream.Stream
    public final Object h(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        supplier.getClass();
        biConsumer.getClass();
        biConsumer2.getClass();
        return i0(new u1(R2.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final IntStream k(ToIntFunction toIntFunction) {
        toIntFunction.getClass();
        return new v(this, Q2.p | Q2.n, toIntFunction, 6);
    }

    @Override // j$.util.stream.Stream
    public final Stream l(Function function) {
        function.getClass();
        return new S1(this, Q2.p | Q2.n | Q2.t, function, 1);
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        function.getClass();
        return new S1(this, Q2.p | Q2.n, function, 0);
    }

    @Override // j$.util.stream.Stream
    public final LongStream mapToLong(ToLongFunction toLongFunction) {
        toLongFunction.getClass();
        return new w(this, Q2.p | Q2.n, toLongFunction, 7);
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        comparator.getClass();
        return o(new j$.util.function.c(comparator, 0));
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        comparator.getClass();
        return o(new j$.util.function.c(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final Optional o(BinaryOperator binaryOperator) {
        binaryOperator.getClass();
        return (Optional) i0(new y1(R2.REFERENCE, binaryOperator, 1));
    }

    @Override // j$.util.stream.Stream
    public final Object u(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        biFunction.getClass();
        binaryOperator.getClass();
        return i0(new u1(R2.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final D w(Function function) {
        function.getClass();
        return new t(this, Q2.p | Q2.n | Q2.t, function, 7);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return t0.c0(this, 0L, j);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : t0.c0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return t0.N(j0(intFunction), intFunction).s(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new c0(4));
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) i0(t0.b0(predicate, q0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean N(Predicate predicate) {
        return ((Boolean) i0(t0.b0(predicate, q0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) i0(t0.b0(predicate, q0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Object i0;
        if (!isParallel() || !collector.characteristics().contains(Collector.Characteristics.CONCURRENT) || (q0() && !collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            collector.getClass();
            Supplier supplier = collector.supplier();
            i0 = i0(new D1(R2.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector));
        } else {
            i0 = collector.supplier().get();
            forEach(new k0(6, collector.accumulator(), i0));
        }
        return collector.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? i0 : collector.finisher().apply(i0);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((h0) mapToLong(new c0(5))).sum();
    }
}
