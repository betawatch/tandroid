package j$.util.stream;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Collector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes2.dex */
abstract class e2 extends b implements Stream {
    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new H2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new o(this, a3.m | a3.t, 0);
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(1, comparator));
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) C(I.d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) C(I.c);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new H2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return C(new C1(b3.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return C(new C1(b3.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C(new O(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C(new O(consumer, true));
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(0, comparator));
    }

    @Override // j$.util.stream.b
    final b3 H() {
        return b3.REFERENCE;
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (Optional) C(new A1(b3.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.b
    final I0 E(b bVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return w0.E(bVar, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.b
    final Spliterator T(b bVar, Supplier supplier, boolean z) {
        return new E3(bVar, supplier, z);
    }

    @Override // j$.util.stream.b
    final boolean G(Spliterator spliterator, m2 m2Var) {
        boolean n;
        do {
            n = m2Var.n();
            if (n) {
                break;
            }
        } while (spliterator.tryAdvance(m2Var));
        return n;
    }

    @Override // j$.util.stream.b
    final A0 M(long j, IntFunction intFunction) {
        return w0.D(j, intFunction);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    public final Iterator iterator() {
        return Spliterators.i(spliterator());
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new s(this, a3.t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new s(this, a3.p | a3.n, function, 5);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new V(this, a3.p | a3.n, toIntFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return C(new C1(b3.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final LongStream mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new g0(this, a3.p | a3.n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final D mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new x(this, a3.p | a3.n, toDoubleFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) C(new E1(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream e(a aVar) {
        Objects.requireNonNull(aVar);
        return new s(this, a3.p | a3.n | a3.t, aVar, 6);
    }

    @Override // j$.util.stream.Stream
    public final IntStream s(a aVar) {
        Objects.requireNonNull(aVar);
        return new V(this, a3.p | a3.n | a3.t, aVar, 3);
    }

    @Override // j$.util.stream.Stream
    public final D y(a aVar) {
        Objects.requireNonNull(aVar);
        return new x(this, a3.p | a3.n | a3.t, aVar, 3);
    }

    @Override // j$.util.stream.Stream
    public final LongStream n(a aVar) {
        Objects.requireNonNull(aVar);
        return new g0(this, a3.p | a3.n | a3.t, aVar, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new s(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return w0.d0(this, 0L, j);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : w0.d0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i = i4.a;
        Objects.requireNonNull(predicate);
        return new K3(this, i4.a, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i = i4.a;
        Objects.requireNonNull(predicate);
        return new M3(this, i4.b, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return w0.N(D(intFunction), intFunction).o(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new b0(12));
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) C(w0.c0(t0.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) C(w0.c0(t0.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) C(w0.c0(t0.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Object C;
        if (!isParallel() || !collector.characteristics().contains(Collector.Characteristics.CONCURRENT) || (K() && !collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            Supplier supplier = ((Collector) Objects.requireNonNull(collector)).supplier();
            C = C(new J1(b3.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector));
        } else {
            C = collector.supplier().get();
            forEach(new n0(3, collector.accumulator(), C));
        }
        return collector.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? C : collector.finisher().apply(C);
    }

    @Override // j$.util.stream.Stream
    public final List toList() {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(toArray())));
    }
}
