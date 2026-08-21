package j$.util.stream;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.Spliterator;
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
public abstract class Y1 extends a implements Stream {
    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new B2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new m(this, S2.m | S2.t, 0);
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) C(G.d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) C(G.c);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new B2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return C(new w1(T2.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return C(new w1(T2.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C(new N(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C(new N(consumer, true));
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
        return (Optional) C(new u1(T2.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.a
    public final C0 E(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return r1.B(aVar, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.a
    public final Spliterator P(a aVar, Supplier supplier, boolean z) {
        return new w3(aVar, supplier, z);
    }

    @Override // j$.util.stream.a
    public final boolean G(Spliterator spliterator, g2 g2Var) {
        boolean C;
        do {
            C = g2Var.C();
            if (C) {
                break;
            }
        } while (spliterator.tryAdvance(g2Var));
        return C;
    }

    @Override // j$.util.stream.a
    public final u0 I(long j, IntFunction intFunction) {
        return r1.z(j, intFunction);
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
        return new q(this, S2.t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new q(this, S2.p | S2.n, function, 5);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new T(this, S2.p | S2.n, toIntFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return C(new w1(T2.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final LongStream mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new d0(this, S2.p | S2.n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final B mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new v(this, S2.p | S2.n, toDoubleFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) C(new y1(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream d(j$.time.t tVar) {
        Objects.requireNonNull(tVar);
        return new q(this, S2.p | S2.n | S2.t, tVar, 6);
    }

    @Override // j$.util.stream.Stream
    public final IntStream n(j$.time.t tVar) {
        Objects.requireNonNull(tVar);
        return new T(this, S2.p | S2.n | S2.t, tVar, 3);
    }

    @Override // j$.util.stream.Stream
    public final B q(j$.time.t tVar) {
        Objects.requireNonNull(tVar);
        return new v(this, S2.p | S2.n | S2.t, tVar, 3);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Collector collector2;
        Object C;
        if (!this.a.k || !collector.characteristics().contains(g.CONCURRENT) || (S2.ORDERED.q(this.f) && !collector.characteristics().contains(g.UNORDERED))) {
            Supplier supplier = ((Collector) Objects.requireNonNull(collector)).supplier();
            collector2 = collector;
            C = C(new D1(T2.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector2));
        } else {
            C = collector.supplier().get();
            forEach(new j$.util.concurrent.t(7, collector.accumulator(), C));
            collector2 = collector;
        }
        return collector2.characteristics().contains(g.IDENTITY_FINISH) ? C : collector2.finisher().apply(C);
    }

    @Override // j$.util.stream.Stream
    public final LongStream v(j$.time.t tVar) {
        Objects.requireNonNull(tVar);
        return new d0(this, S2.p | S2.n | S2.t, tVar, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new q(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return r1.Y(this, 0L, j);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : r1.Y(this, j, -1L);
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
        return r1.J(D(intFunction), intFunction).h(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new Z(20));
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) C(r1.X(p0.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) C(r1.X(p0.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) C(r1.X(p0.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final List toList() {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(toArray())));
    }
}
