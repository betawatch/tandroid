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
public abstract class b5 extends a implements Stream {
    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new e6(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new m(this, v6.m | v6.t);
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) I0(h0.d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) I0(h0.c);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new e6(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return I0(new y3(w6.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return I0(new y3(w6.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        I0(new o0(consumer, false));
    }

    @Override // j$.util.stream.Stream
    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        I0(new o0(consumer, true));
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 0));
    }

    @Override // j$.util.stream.a
    public final w6 M0() {
        return w6.REFERENCE;
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (Optional) I0(new w3(w6.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.a
    public final e2 K0(a aVar, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return t3.a0(aVar, spliterator, z10, intFunction);
    }

    @Override // j$.util.stream.a
    public final Spliterator T0(a aVar, Supplier supplier, boolean z10) {
        return new z7(aVar, supplier, z10);
    }

    @Override // j$.util.stream.a
    public final boolean L0(Spliterator spliterator, j5 j5Var) {
        boolean q6;
        do {
            q6 = j5Var.q();
            if (q6) {
                break;
            }
        } while (spliterator.tryAdvance(j5Var));
        return q6;
    }

    @Override // j$.util.stream.t3
    public final w1 A0(long j10, IntFunction intFunction) {
        return t3.Y(j10, intFunction);
    }

    @Override // j$.util.stream.BaseStream
    public final Iterator iterator() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.f1(spliterator);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new q(this, v6.t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new q(this, v6.p | v6.n, function, 5);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new t0(this, v6.p | v6.n, toIntFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return I0(new y3(w6.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final LongStream mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new e1(this, v6.p | v6.n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final c0 mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new v(this, v6.p | v6.n, toDoubleFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) I0(new a4(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream d(j$.time.t tVar) {
        Objects.requireNonNull(tVar);
        return new q(this, v6.p | v6.n | v6.t, tVar, 6);
    }

    @Override // j$.util.stream.Stream
    public final IntStream u(j$.time.t tVar) {
        Objects.requireNonNull(tVar);
        return new t0(this, v6.p | v6.n | v6.t, tVar, 3);
    }

    @Override // j$.util.stream.Stream
    public final c0 x(j$.time.t tVar) {
        Objects.requireNonNull(tVar);
        return new v(this, v6.p | v6.n | v6.t, tVar, 3);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Collector collector2;
        Object I0;
        if (!this.h.r || !collector.characteristics().contains(g.CONCURRENT) || (v6.ORDERED.m(this.m) && !collector.characteristics().contains(g.UNORDERED))) {
            Supplier supplier = ((Collector) Objects.requireNonNull(collector)).supplier();
            collector2 = collector;
            I0 = I0(new f4(w6.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector2));
        } else {
            I0 = collector.supplier().get();
            forEach(new j$.util.concurrent.t(7, collector.accumulator(), I0));
            collector2 = collector;
        }
        return collector2.characteristics().contains(g.IDENTITY_FINISH) ? I0 : collector2.finisher().apply(I0);
    }

    @Override // j$.util.stream.Stream
    public final LongStream p(j$.time.t tVar) {
        Objects.requireNonNull(tVar);
        return new e1(this, v6.p | v6.n | v6.t, tVar, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new q(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(Long.toString(j10));
        }
        return t3.C0(this, 0L, j10);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? this : t3.C0(this, j10, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i10 = w8.a;
        Objects.requireNonNull(predicate);
        return new e8(this, w8.a, predicate, 0);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i10 = w8.a;
        Objects.requireNonNull(predicate);
        return new e8(this, w8.b, predicate, 1);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return t3.m0(J0(intFunction), intFunction).g(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new a1(20));
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) I0(t3.B0(r1.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) I0(t3.B0(r1.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) I0(t3.B0(r1.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final List toList() {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(toArray())));
    }
}
