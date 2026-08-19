package j$.util.stream;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.Spliterator;
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
public abstract class X1 extends a implements Stream {
    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new A2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new l(this, S2.m | S2.t, 0);
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) C(F.d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) C(F.c);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new A2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return C(new v1(T2.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return C(new v1(T2.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C(new M(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C(new M(consumer, true));
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 0));
    }

    @Override // j$.util.stream.a
    public final T2 H() {
        return T2.REFERENCE;
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (Optional) C(new t1(T2.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.a
    public final B0 E(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return q1.B(aVar, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.a
    public final Spliterator P(a aVar, Supplier supplier, boolean z) {
        return new w3(aVar, supplier, z);
    }

    @Override // j$.util.stream.a
    public final boolean G(Spliterator spliterator, f2 f2Var) {
        boolean C;
        do {
            C = f2Var.C();
            if (C) {
                break;
            }
        } while (spliterator.tryAdvance(f2Var));
        return C;
    }

    @Override // j$.util.stream.a
    public final t0 I(long j, IntFunction intFunction) {
        return q1.z(j, intFunction);
    }

    @Override // j$.util.stream.BaseStream
    public final Iterator iterator() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.e0(spliterator);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new p(this, S2.t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new p(this, S2.p | S2.n, function, 5);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new S(this, S2.p | S2.n, toIntFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return C(new v1(T2.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final LongStream mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new c0(this, S2.p | S2.n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final A mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new u(this, S2.p | S2.n, toDoubleFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) C(new x1(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream d(j$.time.t tVar) {
        Objects.requireNonNull(tVar);
        return new p(this, S2.p | S2.n | S2.t, tVar, 6);
    }

    @Override // j$.util.stream.Stream
    public final IntStream n(j$.time.t tVar) {
        Objects.requireNonNull(tVar);
        return new S(this, S2.p | S2.n | S2.t, tVar, 3);
    }

    @Override // j$.util.stream.Stream
    public final A q(j$.time.t tVar) {
        Objects.requireNonNull(tVar);
        return new u(this, S2.p | S2.n | S2.t, tVar, 3);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Collector collector2;
        Object C;
        if (!this.a.k || !collector.characteristics().contains(Collector.Characteristics.CONCURRENT) || (S2.ORDERED.q(this.f) && !collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            Supplier supplier = ((Collector) Objects.requireNonNull(collector)).supplier();
            collector2 = collector;
            C = C(new C1(T2.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector2));
        } else {
            C = collector.supplier().get();
            forEach(new j$.util.concurrent.t(7, collector.accumulator(), C));
            collector2 = collector;
        }
        return collector2.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? C : collector2.finisher().apply(C);
    }

    @Override // j$.util.stream.Stream
    public final LongStream v(j$.time.t tVar) {
        Objects.requireNonNull(tVar);
        return new c0(this, S2.p | S2.n | S2.t, tVar, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new p(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return q1.X(this, 0L, j);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : q1.X(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i = X3.a;
        Objects.requireNonNull(predicate);
        return new B3(this, X3.a, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i = X3.a;
        Objects.requireNonNull(predicate);
        return new D3(this, X3.b, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return q1.J(D(intFunction), intFunction).h(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new Y(20));
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) C(q1.W(o0.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) C(q1.W(o0.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) C(q1.W(o0.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final List toList() {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(toArray())));
    }
}
